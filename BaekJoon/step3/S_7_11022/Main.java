package BaekJoon.step3.S_7_11022;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        for(int i = 0, len = Integer.parseInt(br.readLine()); i<len; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A+B));
            bw.newLine();
        }

        bw.close();
    }
}
