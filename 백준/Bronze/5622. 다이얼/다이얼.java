import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 1
         * 2 : ABC
         * 3 : DEF
         * 4 : GHI
         * 5 : JKL
         * 6 : MNO
         * 7 : PQRS
         * 8 : TUV
         * 9 : WXYZ
         * 0
         *
         * 1 = 2
         * 2 = 3
         * 3 = 4
         * ...
         * 9 = 10
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dialogStr = br.readLine().split("");
        int sum = 0;
        Main main = new Main();
        for(int i=0, len= dialogStr.length; i<len; i++) {
            sum+= main.dial(dialogStr[i]);
        }
        System.out.println(sum);
    }
    int dial(String c) {
        int result = 0;
        switch (c) {
            case "A" : case "B" : case "C" :
                result = 3;
                break;
            case "D" : case "E" : case "F" :
                result = 4;
                break;
            case "G" : case "H" : case "I" :
                result = 5;
                break;
            case "J" : case "K" : case "L" :
                result = 6;
                break;
            case "M" : case "N" : case "O" :
                result = 7;
                break;
            case "P" : case "Q" : case "R" : case "S" :
                result = 8;
                break;
            case "T" : case "U" : case "V" :
                result = 9;
                break;
            case "W" : case "X" : case "Y" : case "Z" :
                result = 10;
                break;
        }
        return result;
    }
}