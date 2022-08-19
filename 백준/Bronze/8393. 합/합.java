import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n < 1 || 10_000 < n) {
            System.out.println("n은 1부터 10,000 사이의 숫자로 입력해주세요.");
            n = input.nextInt();
        }
        int result = 0;
        for(int i=0; i<=n; i++){
            result += i;
        }
        System.out.println(result);
        input.close();
    }    
}