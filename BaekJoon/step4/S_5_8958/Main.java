package BaekJoon.step4.S_5_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스의 개수 및 테스트 케이스 작성
        int T = Integer.parseInt(br.readLine());
        String[] s = new String[T];
        for(int i=0; i<T; i++) {
            s[i] = br.readLine();
        }

        //OX 점수 구하기
        int count;
        int score[] = new int[T];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++) {
            count = 1;
            String[] sp = s[i].split("");
            for(int j=0, len=sp.length; j<len; j++){
                if(sp[j].equals("O")){
                    score[i] += count++;
                } else {
                    count = 1;
                }
            }
            sb.append(score[i]).append("\n");
        }

        //OX 점수 출력
        System.out.println(sb.toString());
    }
}
