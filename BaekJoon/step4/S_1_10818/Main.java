package BaekJoon.step4.S_1_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //시간 508 ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] A = new int[N];
        int iMin = 1_000_000;
        int iMax = -1_000_000;
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i : A) {
            iMin = Math.min(i, iMin);
            iMax = Math.max(i, iMax);
        }
        sb.append(iMin).append(" ").append(iMax);

        System.out.println(sb.toString());
    }
}
