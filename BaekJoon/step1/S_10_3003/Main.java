package BaekJoon.step1.S_10_3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //킹 = 1, 퀸 = 1, 룩 = 2, 비숍 = 2, 나이트 = 2, 폰 = 8

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] piece = {1, 1, 2, 2, 2, 8};

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<6; i++) {
            sb.append(piece[i] - Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.println(sb);

    }
}
