import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(sb2.append(st.nextToken()).reverse().toString());
        if(a>b) System.out.println(a);
        if(a<b) System.out.println(b);

    }
}
