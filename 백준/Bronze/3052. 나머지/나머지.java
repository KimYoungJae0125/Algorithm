import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] A = new int[10];

        for(int i=0; i<10; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        Set<Integer> result = new HashSet<>();
        for(int i=0; i<10; i++) {
            result.add(A[i] % 42);
        }
        System.out.println(result.size());

    }
}
