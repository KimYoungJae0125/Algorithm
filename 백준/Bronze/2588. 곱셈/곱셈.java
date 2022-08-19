import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		while (a < 1) {
			System.out.print("자연수(0을 제외한 양의 정수)만 입력해주세요. \n다시 입력해주세요 : ");
			a = sc.nextInt();
		};
		
		int b = sc.nextInt();
		while (b < 1) {
			System.out.print("자연수(0을 제외한 양의 정수)만 입력해주세요. \n다시 입력해주세요 : ");
			b = sc.nextInt();
		};
		
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*((b%1000)/100));
		System.out.println(a*b);
		
	}
}
