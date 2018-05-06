package com.longwu.maney.utils;

import org.apache.commons.codec.binary.Base64;

import java.io.FileOutputStream;
import java.util.Random;

public class CommUtils {
    /**
     * 生产随机数
     */
    public static String genRandom(int len) {
        String result = "";
        Random ran = new Random();
        String sValue = String.valueOf(Math.abs(ran.nextLong()));
        if (sValue.length() >= len) {
            result = sValue.substring(0, len);
        } else {
            result = rightPad(sValue, len, '0');
        }
        return result;
    }

    /**
     * 补齐leftPad
     * 
     * @param str
     * @param len
     * @param ch
     * @return
     */
    public static String leftPad(String str, int len, char ch) {
        StringBuffer nstr = new StringBuffer(len);

        int p = len - str.length();

        for (int i = 0; i < len; i++) {
            if (i < p)
                nstr.append(ch);
            else
                nstr.append(str.charAt(i - p));
        }

        return new String(nstr);
    }

    public static String rightPad(String str, int len, char ch) {
        byte[] byteStr = str.getBytes();
        int p = len - byteStr.length;
        String nstr = "";

        for (int i = 0; i < p; i++) {
            nstr = nstr + ch;
        }

        nstr = str + nstr;
        return nstr;
    }
    
    //base64字符串转化成图片  
    public static boolean GenerateImage(String imgStr, String path)  
    {   //对字节数组字符串进行Base64解码并生成图片  
        if (imgStr == null) //图像数据为空  
            return false;  
        try   
        {  
            //Base64解码  
            byte[] b=imgStr.getBytes();
            Base64 base64=new Base64();
            b=base64.encode(b);
            //生成jpeg图片  
            String imgFilePath = path;//新生成的图片  
            FileOutputStream out = new FileOutputStream(imgFilePath);      
            out.write(b);  
            out.flush();  
            out.close();  
            return true;  
        }   
        catch (Exception e)   
        {  
            return false;  
        }  
    }  

    /**
     * 计算校验位
     */
    public static String getLastBit(String seqno) {
        StringBuffer sbCustId = new StringBuffer(seqno);
        
        // 得到第一位校验位
        int len = sbCustId.length(), a = 0, b = 0;
        for (int i = 0; i < len; i++) {
            // 偶数位
            if ((i % 2) != 0) {
                b = 2 * Character.digit(sbCustId.charAt(i), 10);
                
                // 大于10时，需要将个位数字和十位数字相加
                if (b >= 10) {
                    b = b / 10 + (b - b / 10 * 10);
                }
                
            } else {
                b = Character.digit(sbCustId.charAt(i), 10);
            }
            
            a += b;
        }
        
        // 得到校验位
        if ( (a % 10) == 0 ) {
            b = 0;
            
        } else {
            b = (a / 10 + 1) * 10 - a;
        }

        return String.valueOf(b);
    }
    
    /**
     * 格式化 银行账号 取前4位 + **** **** + 后四位
     * @param bankAcctId
     */
    public static String formatBankAcctId(String bankAcctId){
        if (bankAcctId == null || bankAcctId.length() < 8) {
            return bankAcctId;
        }
        
        int length = bankAcctId.length();
        String result = bankAcctId.subSequence(0, 4) + " **** **** " + bankAcctId.substring(length-4, length);
        
        return result;
    }
    
    /**
     * 格式化 卡号 取前6位 + ** **** + 后四位
     * @param bankCardId
     */
    public static String maskCardNo(String bankCardId){
        if (bankCardId == null || bankCardId.length() < 8) {
            return bankCardId;
        }
        
        int length = bankCardId.length();
        String result = bankCardId.subSequence(0, 6) + " ** **** " + bankCardId.substring(length-4, length);
        
        return result;
    }
}
