import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		while (a<0) {
			System.out.print("a는 0보다 커야합니다. \n다시 입력해주세요 : ");
			a = sc.nextInt();
		};
		
		int b = sc.nextInt();
		while(10<b) {
			System.out.print("b는 10보다 작아야합니다.\n다시 입력해주세요 : ");
			b = sc.nextInt();
		}
		
		System.out.println(a-b);
		
	}
}