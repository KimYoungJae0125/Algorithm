import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int x = -1;
        int y = -1;
        while(x != 0 && y != 0){
            st = new StringTokenizer(br.readLine(),  " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x+y != 0){
                sb.append(x + y).append("\n");
            }
        }
        System.out.println(sb.toString());

    }
}