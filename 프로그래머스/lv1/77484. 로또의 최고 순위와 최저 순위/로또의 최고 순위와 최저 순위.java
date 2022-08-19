import java.util.*;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Map<Integer, Boolean> lotto_map = new HashMap<>();

        for(int i=0; i<6; i++) {
            lotto_map.put(win_nums[i], true);
        }

        Long[] count_lotto_winning = new Long[2];

        count_lotto_winning[0] = Arrays.stream(lottos)
                .filter(i -> lotto_map.get(i)!=null && lotto_map.get(i) || i==0)
                .count();

        count_lotto_winning[1]  = Arrays.stream(lottos)
                .filter(i -> lotto_map.get(i)!=null && lotto_map.get(i))
                .count();

        answer[0] = LottoWinning(count_lotto_winning[0] == 0 ? 1L :  count_lotto_winning[0]);
        answer[1] = LottoWinning(count_lotto_winning[1] == 0 ? 1L :  count_lotto_winning[1] );

        return answer;
    }

    public int LottoWinning(Long count) {
        int[] result = {6, 5, 4, 3, 2, 1};
        return result[count.intValue() - 1];
    }
}