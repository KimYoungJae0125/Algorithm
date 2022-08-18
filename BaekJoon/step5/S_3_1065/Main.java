package BaekJoon.step5.S_3_1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i=1, len = Integer.parseInt(br.readLine()); i<=len; i++){
            if(new Main().hansu(String.valueOf(i))){
                count++;
            }
        }
        System.out.println(count);
    }

    boolean hansu(String str) {
        char[] c = str.toCharArray();
        int len = c.length;

        if(len > 2) {
            int n1 = Character.getNumericValue(c[0]);
            int n2 = Character.getNumericValue(c[1]);
            int n3 = Character.getNumericValue(c[2]);
            return n3 - n2 == n2 - n1;
        }
            return true;
    }

}
