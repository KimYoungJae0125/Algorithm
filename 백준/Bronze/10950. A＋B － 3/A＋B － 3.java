import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int t = sc.nextInt();
		while (t < 0) {
			System.out.print("t는 0보다 커야합니다. \n다시 입력해주세요 : ");
			t = sc.nextInt();
		};
   
		for(int i=0; i<t; i++) {
			System.out.println(sc.nextInt() +  sc.nextInt());
		}
		
	}
}
