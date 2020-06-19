package xyz.apichiyu.project.util;

public class UrlUtil {
    public static String makeUrl(String base, String sessionId, String sessionKey) {
        StringBuilder sb = new StringBuilder(base);
        String nonceStr = StringUtil.randomString(32);
        String temp = "sessionId=" + sessionId +
                "&sessionKey=" + sessionKey +
                "&nonceStr=" + nonceStr;
        String sign = StringUtil.encrypt(temp);
        temp += "&sign="+sign;
        if (base.indexOf("?") >= 0) {
            sb.append("&");
        } else {
            sb.append("?");
        }
        sb.append(temp);
        return sb.toString();
    }
}
