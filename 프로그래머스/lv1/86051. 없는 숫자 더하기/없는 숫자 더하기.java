import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        return  Arrays.stream(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
                .filter(i -> {
                    for (int j = 0, len=numbers.length; j < len; j++) {
                        if (i == numbers[j]) {
                            return false;
                        }
                    }
                    return true;
                }).sum();
    }
}