package com.test;

import javax.crypto.*;
import java.security.*;
import javax.crypto.spec.*;

import org.apache.commons.codec.binary.Base64;

public class UserPasswordUtil {

	private static final String KEY = "BlackPAY";

	private static Cipher cipher = null;

	private static Key key;

	private static void desEncrypt(String strkey) throws Exception{
		
			byte[] secretKey = strkey.getBytes();
			SecretKeyFactory kf = SecretKeyFactory.getInstance("DES");
			DESKeySpec keySpec = new DESKeySpec(secretKey);
			key = kf.generateSecret(keySpec);
			cipher = Cipher.getInstance("DES");
		
	}

	public static String decode(String obj) throws Exception{
		if(obj==null) return null;
		String resultStr = null;
		desEncrypt(KEY);
		
			cipher.init(Cipher.DECRYPT_MODE, key);

			Base64 base64 = new Base64();

			byte[] objByte = base64.decode(obj.getBytes("UTF-8"));
			byte[] result = cipher.doFinal(objByte);
			resultStr = new String(result, "UTF-8");
			
		return resultStr;
	}

	public static String encode(String obj)throws Exception {
		if(obj==null) return null;
		desEncrypt(KEY);
		String resultStr = null;
		
			cipher.init(Cipher.ENCRYPT_MODE, key);

			Base64 base64 = new Base64();
			byte[] objByte = obj.getBytes("UTF-8");
			byte[] result = cipher.doFinal(objByte);
			resultStr = new String(base64.encode(result), "UTF-8");

		return resultStr;

	}
	
	public static void main(String[] a){
//		try {
//			logger.info(UserPasswordUtil.decode("sh2ba3RMG9i29rdfAlvk7w=="));
//			logger.info(UserPasswordUtil.encode("root"));
//		} catch (PasswordCodeException e) {
//			e.printStackTrace();
//		}
		
		try {
			String pwd = "ming";
			String pwd_encoded = UserPasswordUtil.encode(pwd);
			System.out.println("encoded = " + pwd_encoded);
			
			String pwd_decoded = UserPasswordUtil.decode(pwd_encoded);
			System.out.println("decoded = " + pwd_decoded);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
