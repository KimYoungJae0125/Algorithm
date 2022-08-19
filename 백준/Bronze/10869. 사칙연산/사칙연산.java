import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		while (1 > a || a > 10000) {
			System.out.print("a는 1보다 크고 10,000보다 작아야합니다. \n다시 입력해주세요 : ");
			a = sc.nextInt();
		};
		
		int b = sc.nextInt();
		while(1 > b || b > 10000) {
			System.out.print("b는 1보다 크고 10,000보다 작아야합니다.\n다시 입력해주세요 : ");
			b = sc.nextInt();
		}
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	}
}