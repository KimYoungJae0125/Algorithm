import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {

            int cycle = 0;
            String N = br.readLine();
            String sum = N;
            do {
                cycle++;

                if(sum.length() <= 1){
                    sum = "0" + sum;
                }
                String[] sumSplit = sum.split("");
                sum = String.valueOf(Integer.parseInt(sumSplit[0]) + Integer.parseInt(sumSplit[1]));
                if(sum.length() > 1){
                    sum = sum.split("")[1];
                }
                sum = sumSplit[1] + sum;
                sum = String.valueOf(Integer.parseInt(sum));
            } while(!N.equals(sum));
            bw.write(String.valueOf(cycle));
            bw.flush();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
