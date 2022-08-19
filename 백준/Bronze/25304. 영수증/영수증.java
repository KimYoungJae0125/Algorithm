import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        try {
            int price = Integer.parseInt(br.readLine().trim());
            int numberOfTypes = Integer.parseInt(br.readLine().trim());
            StringTokenizer st;
            int goodsPrice = 0;
            for (int i = 0; i < numberOfTypes; i++) {

                st = new StringTokenizer(br.readLine(), " ");
                goodsPrice += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());

            }

            bw.write(price - goodsPrice == 0 ? "Yes" : "No");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
