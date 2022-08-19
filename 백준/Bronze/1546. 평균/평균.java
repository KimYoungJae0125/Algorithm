import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //시험 본 과목의 개수
        int N = Integer.parseInt(br.readLine());

        //과목 점수
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        //점수 중 최대값 구하기
        int Max = 0;
        for(int i : A) {
            Max = Math.max(i, Max);
        }

        //점수 조작하기
        double score = 0;
        for(int i : A) {
            score += ((double) i/Max*100);
        }
        //평균 구하기
        System.out.println(score/N);
    }
}
