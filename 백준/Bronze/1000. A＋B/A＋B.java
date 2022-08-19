import java.util.Scanner;

public class Main{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = -1, B = 11;
        while(A<0){
            A = input.nextInt();
        }
        while(10<B){
            B = input.nextInt();
        }
        System.out.println(A+B);

    }
}