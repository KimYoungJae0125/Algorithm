import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new Main().pi(Integer.parseInt(br.readLine()), 1, 0, 1));
    }
    int pi(int n, int i, int j, int count) {
        if(count <= n) {
            int before = j;
            j +=  i;
            i = before;
            return pi(n, i, j, ++count);
        } else {
            return j;
        }
    }
}
