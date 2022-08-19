import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int x = sc.nextInt();
		while ((x < -1000 || x > 1000) && x != 0) {
			System.out.print("x는 정수만 입력해주세요(0 제외) \n다시 입력해주세요 : ");
			x = sc.nextInt();
		};

		int y = sc.nextInt();
		while ((y < -1000 || y > 1000) && y != 0) {
			System.out.print("y는 정수만 입력해주세요(0 제외) \n다시 입력해주세요 : ");
			y = sc.nextInt();
		};

		//x, y가 양수일 경우
		if(x > 0 && y > 0) {
			System.out.println("1");
		}
		//x가 음수 y가 양수일 경우
		if(x < 0 && y > 0) {
			System.out.println("2");
		}
		//x, y가 음수일 경우
		if(x < 0 && y < 0) {
			System.out.println("3");
		}
		//x가 양수 y가 음수일 경우
		if(x > 0 && y < 0) {
			System.out.println("4");
		}
		
	}
}
