import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        while(10_000<A || A<-10_000){
            System.out.println("A는 -10,000보다 크거나 같고 10,000보다 작거나 같은 수를 입력해주세요.");
            A = input.nextInt();
        }
        int B = input.nextInt();
        while(10_000<B || B<-10_000){
            System.out.println("B는 -10,000보다 크거나 같고 10,000보다 작거나 같은 수를 입력해주세요.");
            B = input.nextInt();
        }
        String result = "";
        if(A < B) result = "<";
        if(A == B) result = "==";
        if(A >B) result = ">";

        System.out.println(result);
    }
}