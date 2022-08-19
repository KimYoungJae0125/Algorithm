import java.util.Scanner;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String loginId = input.next();
        String pattern = "^[a-z]*$";
        while(50 < loginId.length() || !Pattern.matches(pattern, loginId)){
            System.out.println("아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘으면 안 됩니다.");
            loginId = input.next();
        }
        System.out.println(loginId + "??!");
    }
}