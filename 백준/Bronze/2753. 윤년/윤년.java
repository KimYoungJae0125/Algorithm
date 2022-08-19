import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		while (a <= 0 || a>4000) {
			System.out.print("a는 1보다 크거나 같고 4000보다 작아야합니다. \n다시 입력해주세요 : ");
			a = sc.nextInt();
		};
		
		if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
