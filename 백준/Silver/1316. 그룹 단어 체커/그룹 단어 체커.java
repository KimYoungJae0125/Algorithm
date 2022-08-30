import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i=0, len=Integer.parseInt(br.readLine()); i<len; i++) {
            String s = br.readLine();
            boolean groupChecker = true;
            for(int j=0, lenJ=s.length(); j<lenJ; j++) {
                int indexOf = s.indexOf(String.valueOf(s.charAt(j)));
                int lastIndexOf = s.lastIndexOf(String.valueOf(s.charAt(j)));
                if(s.substring(indexOf, lastIndexOf).replace(String.valueOf(s.charAt(j)), "").length() > 0) {
                    groupChecker = false;
                    break;
                }
                j = lastIndexOf;
            }
            if(groupChecker) count++;
        }
        System.out.println(count);
    }
}
