class Solution {
    int length, answer = 0;
    public int solution(int[] numbers, int target) {
        length = numbers.length;

        plusOrSub(numbers, numbers[0], 0, target);
        plusOrSub(numbers, -numbers[0], 0, target);

        return answer;
    }

    public void plusOrSub(int[] numbers, int number, int index, int target) {
        if(length-1 == index) {
            if(target == number) answer++;
            return;
        }
        index++;
        plusOrSub(numbers, number+numbers[index], index, target);
        plusOrSub(numbers, number-numbers[index], index, target);
    }
}