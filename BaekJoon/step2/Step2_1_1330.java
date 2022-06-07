package BaekJoon.step2;

import java.util.Scanner;

//두 수 비교하기
public class Step2_1_1330 {
    /*
     * 문제
     * - 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
     * 입력
     * - 첫째 줄에 A와 B가 주어진다.
     * - A와 B는 공백 한 칸으로 구분되어져 있다.
     * 출력
     * - 첫째 줄에 다음 세 가지 중 하나를 출력한다.
     *   1. A가 B보다 큰 경우에는 '>'를 출력한다.
     *   2. A가 B보다 작은 경우에는 '<'를 출력한다.
     *   3. A와 B가 같은 경우에는 '=='를 출력한다.
     * 제한
     * - -10,000<=A, B<=10,000
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        while(10_000<A || A<-10_000){
            System.out.println("A는 -10,000보다 크거나 같고 10,000보다 작거나 같은 수를 입력해주세요.");
            A = input.nextInt();
        }
        int B = input.nextInt();
        while(10_000<B || B<-10_000){
            System.out.println("B는 -10,000보다 크거나 같고 10,000보다 작거나 같은 수를 입력해주세요.");
            B = input.nextInt();
        }
        String result = "";
        if(A < B) result = "<";
        if(A == B) result = "==";
        if(A >B) result = ">";

        System.out.println(result);
    }
}
