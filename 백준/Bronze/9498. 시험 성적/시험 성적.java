import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		while (a<0 || a>100) {
			System.out.print("a는 100보다 작거나  0이상이어야합니다. \n다시 입력해주세요 : ");
			a = sc.nextInt();
		};
		
		if(90 <= a && a <= 100) {
			System.out.println("A");
		}

		if(80 <= a && a < 90) {
			System.out.println("B");
		}

		if(70 <= a && a < 80) {
			System.out.println("C");
		}

		if(60 <= a && a < 70) {
			System.out.println("D");
		}
		
		if(a < 60) {
			System.out.println("F");
		}
		
	}
}
