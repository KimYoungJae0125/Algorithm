import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i=0, len = Integer.parseInt(br.readLine()); i<len; i++){
            for(int j=len-i; 2<=j; j--){
                sb.append(" ");
            }
            for(int j=0; j<i+1; j++){
                sb.append("*");

            }
                sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
