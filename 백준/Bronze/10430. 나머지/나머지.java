import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		while (a < 2 || a > 10000) {
			System.out.print("a는 2보다 크거나 같고 10000보다 작거나 같아합니다. \n다시 입력해주세요 : ");
			a = sc.nextInt();
		};
		
		int b = sc.nextInt();
		while (b < 2 || b > 10000) {
			System.out.print("b는 2보다 크거나 같고 10000보다 작거나 같아합니다. \n다시 입력해주세요 : ");
			b = sc.nextInt();
		};
		
		int c = sc.nextInt();
		while (c < 2 || c > 10000) {
			System.out.print("c는 2보다 크거나 같고 10000보다 작거나 같아합니다. \n다시 입력해주세요 : ");
			c = sc.nextInt();
		};
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
	}
}
