import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //1 = 1             {1}
        //2 = 2,3,4,5,6,7   {6}
        //3 = 8,9,10,11,12,13,14,15,16,17,18,19     {12}
        //4 = 20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37 {18}
        //5 = 38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61   {24}
        //6 ^ n
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), count = 0, sum = 2;
        while(N >= sum) sum += 6*(count++);
        if (N == 1) count = 1;
        System.out.println(count);
    }
}