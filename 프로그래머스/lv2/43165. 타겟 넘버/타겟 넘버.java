class Solution {
    public int solution(int[] numbers, int target) {
        int[] answer = {0};

        getTargetNumber(numbers, numbers.length, numbers[0], 0, target, answer);
        getTargetNumber(numbers, numbers.length, -numbers[0], 0, target, answer);

        return answer[0];
    }

    public void getTargetNumber(int[] numbers, int length, int number, int index, int target, int[] answer) {
        if(length-1 == index) {
            if(target == number) answer[0]++;
            return;
        }
        index++;
        getTargetNumber(numbers, length, number+numbers[index], index, target, answer);
        getTargetNumber(numbers, length, number-numbers[index], index, target, answer);
    }
}