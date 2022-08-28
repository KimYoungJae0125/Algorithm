import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] al = br.readLine().toUpperCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>() {{
            for(int i=0, len=al.length; i<len; i++) put(al[i], 0);
        }};
        for(int i=0, len=al.length; i<len; i++) {
            map.put(al[i], map.get(al[i])+1);
        }
        int max = -1;
        for(char key : map.keySet()) {
            if(map.get(key) > max) max = map.get(key);
        }
        String s = "";
        int count = 0;
        for(char key : map.keySet()) {
            if(map.get(key) == max) {
                count++;
                if(count > 1) {
                    s = "?";
                    break;
                }
                s = String.valueOf(key);
            }
        }
        System.out.println(s);
    }
}
