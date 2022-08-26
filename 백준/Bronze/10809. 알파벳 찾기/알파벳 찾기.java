import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] alphabetChar = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] readChar = br.readLine().toCharArray();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0, len=alphabetChar.length; i<len; i++){
            int count = -1;
            for(int j=0, lenJ=readChar.length; j<lenJ; j++) {
                if(alphabetChar[i] == readChar[j]) {
                    count = j;
                    break;
                }
            }
            bw.write(count + " ");
        }
        bw.close();

    }
}
