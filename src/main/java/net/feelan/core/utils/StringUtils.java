package net.feelan.core.utils;

public class StringUtils {

    /**
     * 合法手机号验证
     * 
     * @param mobile
     * @return
     */
    public static boolean isMoblile(String mobile) {
        String mobileString = "^0{0,1}(12[0-9]|13[0-9]|14[0-9]|15[0-9]|16[0-9]|17[0-9]|18[0-9]|19[0-9])[0-9]{8}$";
        return mobile.matches(mobileString);
    }

    public static boolean isEncoding(String str, String encode) {
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                return true;
            }
        } catch (Exception exception) {
        }
        return false;
    }

}
