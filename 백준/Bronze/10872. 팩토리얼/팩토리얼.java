import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new Main().factorial(Integer.parseInt(br.readLine()), 1));
    }
    int factorial(int N, int sum) {
        if(N < 1) {
            return sum;
        } else {
            sum *= N--;
            return factorial(N, sum);
        }
    }
}
