import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int h = sc.nextInt();
		while (0 > h || 24 < h ) {
			System.out.print("0~23시까지만 입력 가능합니다. \n다시 입력해주세요 : ");
			h = sc.nextInt();
		};

		int m = sc.nextInt();
		while (0 > m || 60 < m) {
			System.out.print("0~59분까지 입력 가능합니다 \n다시 입력해주세요 : ");
			m = sc.nextInt();
		};
		
		m = m-45;
		if(m<0) {
			h--;
			m = 60+m;
		}
		if(h < 0) {
			h = 23;
		}
		
		System.out.println(h + " " + m);
		
	}
}
