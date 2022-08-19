import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 0;
        try {
      
           T = Integer.parseInt(br.readLine());
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st;
            for(int i=0; i<T; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                bw.write(String.valueOf(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {

        }

    }

}
