import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        while(y < 1000 || 3000 < y) {
            System.out.println("1000~3000 사이의 연도를 입력해주세요.");
            y = input.nextInt();
        }
        System.out.println(y-543);
    }
}