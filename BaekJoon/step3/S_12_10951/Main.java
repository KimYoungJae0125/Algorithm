package BaekJoon.step3.S_12_10951;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";

        StringTokenizer st;
        try {
            while((input = br.readLine()) != null && !input.isEmpty()) {
                st = new StringTokenizer(input, " ");
                bw.write(String.valueOf(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
                bw.newLine();
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
