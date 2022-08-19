import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        while(time < 0 || 24 < time) {
            System.out.println("시간은 0~24 사이의 숫자만 들어갈 수 있습니다.");
            time = input.nextInt();
        }
        int minute = input.nextInt();
        while(minute < 0 || 59 < minute) {
            System.out.println("분은 0~59 사이의 숫자만 들어갈 수 있습니다.");
            minute = input.nextInt();
        }
        int cookMinute = input.nextInt();
        while(cookMinute < 0 || 1_000 < cookMinute) {
            System.out.println("요리 시간은 0~1,000분의 범위로만 설정 가능합니다.");
            cookMinute = input.nextInt();
        }

        int tempTime = minute + cookMinute;
        int cookTime = tempTime / 60;
        minute = tempTime % 60;

        time += cookTime;
        if(time >= 24){
            time -= 24;
        }
        System.out.println(time + " " + minute);
    }
}