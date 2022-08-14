package BaekJoon.step4.S_1_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class MainByStream {
    //시간 엄청 오래걸림
    //592 ms, 1192 ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }
        StringBuilder sb = new StringBuilder();
        A = A.stream().sorted().collect(Collectors.toList());
//        sb.append(A.stream().mapToInt(i -> i).min().getAsInt())
//           .append(" ")
//           .append(A.stream().mapToInt(i -> i).max().getAsInt());
        sb.append(A.get(0)).append(" ").append(A.get(N-1));
        System.out.println(sb.toString());
    }
}
