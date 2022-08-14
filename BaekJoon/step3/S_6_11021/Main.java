package BaekJoon.step3.S_6_11021;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        for(int i = 0, len = Integer.parseInt(br.readLine()); i<len; i++){
            st = new StringTokenizer(br.readLine(), " ");
            bw.write("Case #" + (i+1) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
            bw.newLine();
        }

        bw.close();
    }
}
