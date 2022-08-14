package BaekJoon.step4.S_2_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] A = new int[9];
        for(int i=0; i<9; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        int index = 0;
        int Max = 0;
        for(int i=0; i<9; i++) {
            if(Math.max(A[i], Max) != Max){
                index = i+1;
                Max = A[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(Max).append("\n").append(index);
        System.out.println(sb.toString());

    }
}
