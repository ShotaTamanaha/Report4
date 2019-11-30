import java.io.IOException;

public class Report4 {
    public static void main(String[] args) {
        String str;
        str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {//ここでキャッチして標準出力する
            System.out.println("NullPointerExceptionが発生した");
            System.out.println(e.getMessage());
        }
    }
}