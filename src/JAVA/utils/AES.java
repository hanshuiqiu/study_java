package JAVA.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AES {/*

	 // 加密
   public static String Encrypt(String sSrc, String sKey) throws Exception {
       if (sKey == null) {
           System.out.print("Key为空null");
           return null;
       }
       // 判断Key是否为16位
       if (sKey.length() != 16) {
           System.out.print("Key长度不是16位");
           return null;
       }
       byte[] raw = sKey.getBytes("utf-8");
       SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
       //System.out.print(skeySpec);
       Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
       cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
       byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));

       return new String(IceUtilInternal.Base64.encode(encrypted));//此处使用BASE64做转码功能，同时能起到2次加密的作 用。
     //return new String(encrypted,"utf-8");//Base64.encode(encrypted);
   }

   // 解密
   public static String Decrypt(String sSrc, String sKey) throws Exception {
       try {
           // 判断Key是否正确
           if (sKey == null) {
               System.out.print("Key为空null");
               return null;
           }
           // 判断Key是否为16位
           if (sKey.length() != 16) {
               System.out.print("Key长度不是16位");
               return null;
           }
           byte[] raw = sKey.getBytes("utf-8");
           SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
           Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
           cipher.init(Cipher.DECRYPT_MODE, skeySpec);
           
           byte[] encrypted1 = IceUtilInternal.Base64.decode(sSrc);//先用base64解密
         
           try {
               byte[] original = cipher.doFinal(encrypted1);
               String originalString = new String(original,"utf-8");
               return originalString;
           } catch (Exception e) {
               System.out.println(e.toString());
               return null;
           }
       } catch (Exception ex) {
           System.out.println(ex.toString());
           return null;
       }
   }

   *//**将二进制转换成16进制 
    * @param buf 
    * @return 
    *//*  
   public static String parseByte2HexStr(byte buf[]) {  
           StringBuffer sb = new StringBuffer();  
           for (int i = 0; i < buf.length; i++) {  
                   String hex = Integer.toHexString(buf[i] & 0xFF);  
                   if (hex.length() == 1) {  
                           hex = '0' + hex;  
                   }  
                   sb.append(hex.toUpperCase());  
           }  
           return sb.toString();  
   }  
   *//**将16进制转换为二进制 
    * @param hexStr 
    * @return 
    *//*  
   public static byte[] parseHexStr2Byte(String hexStr) {  
           if (hexStr.length() < 1)  
                   return null;  
           byte[] result = new byte[hexStr.length()/2];  
           for (int i = 0;i< hexStr.length()/2; i++) {  
                   int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);  
                   int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);  
                   result[i] = (byte) (high * 16 + low);  
           }  
           return result;  
   }  
   
   public static void main(String[] args) throws Exception {
       
        * 此处使用AES-128-ECB加密模式，key需要为16位。
        
       String cKey = "@jsb@18680506461";
       // 需要加密的字串
       String cSrc = "WFqkuoCvCj5MLDhIj2ZzHvdKQT2qKj31TmK10ygKTGbAyaCSb71qA5gFqggKX0Ny3AeFI3oawK+w@IrX9RfBtrg==";
//       System.out.println(cSrc);
       // 加密
//       String enString = AES.Encrypt(cSrc, cKey);
//       System.out.println("加密后的字串是：" + enString.replace("\r\n", "@"));
       System.out.println("解密：" + AES.Decrypt(cSrc,cKey));

       
       // 解密
//       String DeString = AES.Decrypt("WIuuEzGh05Y9ZJX/e25GJu8+cpeB/F9xhvcGEX7zdMVSJME7NFk1fNYE4wvY9NE23VPtc9hsKCVvUwikxZgsoxMTd/SIZq89+akRfGu5i7Iw3ry6gzfnPgtG+0pJfb9Q+i5ZdnOUFKQMDFCc1KACGEXAiRk2nsSEJADlIMA9yacVa3DN0z8Cdsf74oKzTd9R1wpDmtiUZpkPiD834UN9buXj0fyO7NXcksOsqybulOQa7J5jG3+kznmwk+rjF9UaVN7hjPXgvuqwOVgAYd719gQ5CzrXUmJyDzPhxv4z7gmycrsdBQIJccCIOuiZjaGWW9AE55vldshu7UKMlnm8pcR50OY7cDw2Y9TcqU/u70UQoWYRTa0bEvzwSFXf5sTkZYvD4YVKFTOrXkDnnnrHbDLKwakA7M9OnBviX/dUG1mianIaqSxDB844TjeQ2p5rE46+6enQX04sB4QfUBKWFUKnzJr/6e7fVgIK2f2HuHYurTtyCEPlmJnF2fMVeQIE/zMqiBMec83L1/NH1Q/gS+Qra63h5EdyGeO2DO7Dlj+JR1P0eT7iOZM312n6zCKITD7YFwKRVsfeFRMq/x31VQ4xJyoDtH4E9K4dGbZ4/kuyyLNnDLe9Atiz9r9O9CCrGGi0PXRdjEXFGxQblxnNudT8FtHXUhiXvGUO+DPseArnuc5Xa8HWPb2ijFmd5uX95Og+LxlAM4E3fb9CwAQa7g==", cKey);
//       System.out.println("解密后的字串是：" + DeString);
   }
*/}

