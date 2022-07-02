package BaekJoon.step2;

import java.util.Scanner;

//주사위 세개
public class Step2_7_2480 {
    /*
     * 문제
     * - 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
     *   1. 같은 눈이 3개가 나오면 10,000원 + (같은 눈) * 1,000원의 상금을 받게 된다.
     *   2. 같은 눈이 2개만 나오는 경우에는 1,000원 + (같은 눈) * 100원의 상금을 받게 된다.
     *   3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈) * 100원의 상금을 받게 된다.
     * - 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000 + 3 * 100으로 계산되어 1,300원을 받게 된다.
     * - 또 3개의 눈이 2, 2, 2로 주어지면 10,000 + 2 * 1,000으로 계산되어 12,000원을 받게 된다.
     * - 3개의 눈이 6, 2, 5로 주어지면 그 중 가장 큰 값이 6이므로 6 * 100으로 계산되어 600원을 상금으로 받게 된다.
     * - 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
     * 입력
     * - 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
     * 출력
     * - 첫째 줄에 게임의 상금을 출력 한다.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] diceNumber = new int[3];
        for(int i=0; i<3; i++){
            int inputNumber = input.nextInt();
            while (inputNumber < 1 || 6 < inputNumber){
                System.out.println("주사위는 1~6의 숫자만 가지고 있습니다.");
                inputNumber = input.nextInt();
            }
            diceNumber[i] = inputNumber;
        }

        int result = 0;
        if(diceNumber[0] == diceNumber[1] && diceNumber[1] == diceNumber[2]) {
            result = 10_000 + (diceNumber[0] * 1_000);
        } else if(diceNumber[0] == diceNumber[1] || diceNumber[0] == diceNumber[2]) {
            result = 1_000 + (diceNumber[0] * 100);
        } else if(diceNumber[1] == diceNumber[2]) {
            result = 1_000 + (diceNumber[1] * 100);
        } else {
            result = Math.max(diceNumber[0], Math.max(diceNumber[1], diceNumber[2])) * 100;
        }

        System.out.println(result);

        input.close();
    }
}
