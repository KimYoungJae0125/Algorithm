import java.util.Scanner;

public class Main{
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