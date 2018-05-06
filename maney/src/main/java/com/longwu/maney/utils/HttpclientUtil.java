package com.longwu.maney.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Component
public class HttpclientUtil {
    static Log LOGGER = LogFactory.getLog(HttpclientUtil.class);

    public String HttpClientPost(String url, Object object) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            //获取对象属性
            Field[] fields = object.getClass().getDeclaredFields();
            List<BasicNameValuePair> params = new LinkedList<BasicNameValuePair>();
            for (int n = 0; n < fields.length; n++) {
                String firstLetter = fields[n].getName().substring(0, 1).toUpperCase();
                String getter = "get" + firstLetter + fields[n].getName().substring(1);
                Method method = object.getClass().getMethod(getter, new Class[]{});
                Object value = method.invoke(object, new Object[]{});
                params.add(new BasicNameValuePair(fields[n].getName(), String.valueOf(value)));
                LOGGER.info(fields[n].toString());
            }
            HttpPost postMethod = new HttpPost(url);
            postMethod.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            HttpResponse response = httpClient.execute(postMethod);
            String result = EntityUtils.toString(response.getEntity());
            LOGGER.info("resCode = " + response.getStatusLine().getStatusCode());
            LOGGER.info("result = " + result);
            return result;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return "http连接失败";
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }

    public String HttpClientPost(String url, Map<String, String> map) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            //获取对象属性
            List<BasicNameValuePair> params = new LinkedList<BasicNameValuePair>();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            HttpPost postMethod = new HttpPost(url);
            postMethod.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            HttpResponse response = httpClient.execute(postMethod);
            String result = EntityUtils.toString(response.getEntity());
            LOGGER.info("resCode = " + response.getStatusLine().getStatusCode());
            LOGGER.info("result = " + result + "url：" + url);
            return result;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return "http连接失败";
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }

    public String HttpClientPost(String url, HashMap<String, String> map, String accessToken) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            //获取对象属性
            List<BasicNameValuePair> params = new LinkedList<BasicNameValuePair>();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
            HttpPost postMethod = new HttpPost(url);
            postMethod.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            postMethod.setHeader("accessToken", accessToken);
            postMethod.setHeader("loginTerm", "wx");
            postMethod.setHeader("jhVer", "2.0");
            postMethod.setHeader("rand", CommUtils.genRandom(5));
            HttpResponse response = httpClient.execute(postMethod);
            String result = EntityUtils.toString(response.getEntity());
            LOGGER.info("resCode = " + response.getStatusLine().getStatusCode());
            LOGGER.info("result = " + result);
            return result;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return "http连接失败";
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }

    public String HttpClientGet(String url, String object) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            //获取对象属性
            HttpGet getMethod = new HttpGet(url + "?" + object);
            HttpResponse response = httpClient.execute(getMethod);
            String result = EntityUtils.toString(response.getEntity());
            LOGGER.debug("resCode = " + response.getStatusLine().getStatusCode());
            LOGGER.debug("result = " + result);
            return result;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return "http连接失败";
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }

    public static CloseableHttpClient createSSLClientDefault() {
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                //信任所有
                @Override
                public boolean isTrusted(X509Certificate[] chain,
                                         String authType) throws CertificateException {
                    return true;
                }
            }).build();
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
            return HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (KeyManagementException e) {
            LOGGER.error(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error(e.getMessage(), e);
        } catch (KeyStoreException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return HttpClients.createDefault();
    }

    /**
     * 含证书SSL连接(微信企业付款专用)
     */
    public String SSLHttpClientPost(String url, String data, String wxCerLoc, String pwd) {
        CloseableHttpClient httpClient = null;
        try {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        FileInputStream inputStream = new FileInputStream(new File(wxCerLoc));
        keyStore.load(inputStream,pwd.toCharArray());
        SSLContext sslContext = SSLContexts.custom()
                .loadKeyMaterial(keyStore,pwd.toCharArray())
                .build();
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                sslContext,new String[]{"TLSv1"},null,new DefaultHostnameVerifier()
        );
        httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        HttpPost postMethod = new HttpPost(url);
            postMethod.addHeader("Connection", "keep-alive");
            postMethod.addHeader("Accept", "*/*");
            postMethod.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            postMethod.addHeader("Host", "api.mch.weixin.qq.com");
            postMethod.addHeader("X-Requested-With", "XMLHttpRequest");
            postMethod.addHeader("Cache-Control", "max-age=0");
            postMethod.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0) ");
            postMethod.setEntity(new StringEntity(data, "UTF-8"));
            HttpResponse response = httpClient.execute(postMethod);
            String result = EntityUtils.toString(response.getEntity());
            LOGGER.debug("resCode = " + response.getStatusLine().getStatusCode());
            LOGGER.debug("result = " + result);
            return result;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return "http连接失败";
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }

    public String HttpClientPostJson(String url, String encoderJson, String accessToken) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpPost postMethod = new HttpPost(url);
            StringEntity se = new StringEntity(encoderJson, "UTF-8");
            se.setContentEncoding("UTF-8");
            se.setContentType("application/json");
            postMethod.setEntity(se);
            postMethod.setHeader("accessToken", accessToken);
            postMethod.setHeader("loginTerm", "wx");
            postMethod.setHeader("jhVer", "2.0");
            postMethod.setHeader("rand", "12345");
            HttpResponse response = httpClient.execute(postMethod);
            LOGGER.info("response:" + response);
            String result = EntityUtils.toString(response.getEntity());
            LOGGER.info("resCode = " + response.getStatusLine().getStatusCode());
            LOGGER.info("result = " + result);
            return result;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return "http连接失败";
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }

    public String HttpClientPostJson(String url, String encoderJson) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpPost postMethod = new HttpPost(url);
            StringEntity se = new StringEntity(encoderJson, "UTF-8");
            se.setContentEncoding("UTF-8");
            se.setContentType("application/json");
            postMethod.setEntity(se);
            HttpResponse response = httpClient.execute(postMethod);
            LOGGER.info("response:" + response);
            String result = EntityUtils.toString(response.getEntity());
            LOGGER.info("result:" + result);
            LOGGER.info("resCode = " + response.getStatusLine().getStatusCode());
            LOGGER.info("result = " + result);
            return result;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return "http连接失败";
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }

}
