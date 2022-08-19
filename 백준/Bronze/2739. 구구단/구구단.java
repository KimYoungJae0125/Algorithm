import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		while (n<0 || n>10) {
			System.out.print("n은 1보다 크거나 같고 9보다 작거나 같아야합니다. \n다시 입력해주세요 : ");
			n = sc.nextInt();
		};
		
		for(int i=1, j=9; i<=j; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
	}
}
