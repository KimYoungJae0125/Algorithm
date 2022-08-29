import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new Main().croatia(br.readLine()));
    }
    int croatia(String s) {
        int count=0;
        for(int i=0, len=s.length(); i<len; i++) {
            count++;
            if(i < len-1) {
                if(s.charAt(i) == 'c') if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
                    i++;
                    continue;
                }
                if(s.charAt(i) == 'd') {
                    if(s.charAt(i+1) == '-') {
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1) == 'z') if(i < len-2 && s.charAt(i+2) == '=') {
                        i += 2;
                        continue;
                    }
                }
                if(s.charAt(i) == 'l') if(s.charAt(i+1) == 'j') {
                    i++;
                    continue;
                }
                if(s.charAt(i) == 'n') if(s.charAt(i+1) == 'j') {
                    i++;
                    continue;
                }
                if(s.charAt(i) == 's') if(s.charAt(i+1) == '=') {
                    i++;
                    continue;
                }
                if(s.charAt(i) == 'z') if(s.charAt(i+1) == '=') {
                    i++;
                    continue;
                }
            }
        }

        return count;
    }
}