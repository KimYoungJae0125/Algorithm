import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for(int i=0, len=Integer.parseInt(br.readLine()); i<len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int lenJ = Integer.parseInt(st.nextToken());
            char[] cArray = st.nextToken().toCharArray();
            for(char c : cArray) {
                for(int j=0; j<lenJ; j++) {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
