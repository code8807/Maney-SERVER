package com.longwu.maney.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密
 */
public class ShaUtil {
    
    public static final String SHA_256 = "SHA-256";
    public static final String SHA_512 = "SHA-512";
    
    public static void main(String[] args) {
        System.out.println(encode("000000"));
    }
    
    /**
     * 加密方法
     * 
     * @param strSrc
     * @param encName
     * @return
     */
    public static String encode(String strSrc) {
        
        MessageDigest md = null;
        String strDes = null;

        byte[] bt = strSrc.getBytes();
        try {
//          if (encName == null || encName.equals("")) {
//              encName = SHA_256;
//          }
            md = MessageDigest.getInstance(SHA_256);
            md.update(bt);
            strDes = bytes2Hex(md.digest()); // to HexString
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return strDes;
        
    }
    
    /**
     * 
     * 
     * @param bts
     * @return
     */
    public static String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }
    
}