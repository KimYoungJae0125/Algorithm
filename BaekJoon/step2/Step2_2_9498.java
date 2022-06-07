package BaekJoon.step2;

import java.util.Scanner;

//시험 성적
public class Step2_2_9498 {
    /*
     * 문제
     * - 시험 점수를 입력받아 성적을 입력합니다.
     * - 90~100 : A
     * - 80~89 : B
     * - 70~79 : C
     * - 60~69 : D
     * - 0~60 : F
     * 입력
     * - 첫째 줄에 시험 점수가 주어진다.
     * - 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
     * 출력
     * - 시험 성적을 출력한다.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testScore = input.nextInt();
        while(testScore < 0 || 100 < testScore) {
            System.out.println("0~100 사이의 숫자를 입력해주세요.");
            testScore = input.nextInt();
        }
        String result = "F";
        if(90 <= testScore && testScore <= 100) result = "A";
        if(80 <= testScore && testScore < 90) result = "B";
        if(70 <= testScore && testScore < 80) result = "C";
        if(60 <= testScore && testScore < 70) result = "D";

        System.out.println(result);
    }
}
