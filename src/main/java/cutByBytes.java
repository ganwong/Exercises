import java.io.UnsupportedEncodingException;

public class cutByBytes {
    public static boolean isChineseChar(char c) throws UnsupportedEncodingException{
        return String.valueOf(c).getBytes("GBK").length > 1;
    }

    public static String substring(String original, int count) throws Exception{
        if (original == null || original == "") return null;
//        original = new String(original.getBytes(), "utf-8");
        if (count > 0 && count < original.getBytes().length) {
            StringBuffer buff = new StringBuffer();
            char c;
            for (int i = 0; i < count; i ++) {
                c = original.charAt(i);
                buff.append(c);
                if (isChineseChar(c)) {
                    -- count;
                }
            }
            return buff.toString();
        }
        return original;
    }

    public static void main(String[] args) throws Exception{

    }


}