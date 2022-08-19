import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스의 개수 C
        int C = Integer.parseInt(br.readLine());

        //첫 수 : 학생의 수(N)
        //첫 수 다음 수 : N명의 점수
        String[] testCase = new String[C];
        for(int i=0; i<C; i++) {
            testCase[i] = br.readLine();
        }

        //평균 구하기
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<C; i++) {
            int totalScore = 0;
            String[] sp = testCase[i].split(" ");
            int len = Integer.parseInt(sp[0]) + 1;

            //학생들의 점수
            //score = 총 점수
            int score[] = new int[len];
            for(int j=1; j<len; j++) {
                score[j] = Integer.parseInt(sp[j]);
                totalScore += score[j];
            }
            double average = (double) totalScore / (len - 1);

            //평균 넘는 비율 구하기
            int count = 0;
            for(int j=1; j<len; j++) {
                if(score[j] > average) {
                    count++;
                }
            }
            sb.append(String.format("%,.3f", count / (double) (len-1) * 100)).append("%\n");
        }

        System.out.println(sb.toString());
    }
}