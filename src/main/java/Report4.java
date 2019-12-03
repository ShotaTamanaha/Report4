import java.io.IOException;

public class Report4 {
    public static void main(String[] args) {
       try {
           String str = "百二十三";
        int value = Integer.parseInt(str);
       System.out.println(value);}
       catch (NumberFormatException e){
           System.out.println("NumberFormatExceptionのエラーが発生した");
           System.out.println(e.getMessage());
       }
    }
}