package Programmers.Java.Lv1.Dev_Matching_2021;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
//        int[] answer = {};
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
        answer[1] = LottoWinning(count_lotto_winning[1] == 0 ? 1L :  count_lotto_winning[1]);

        return answer;
    }

    public int LottoWinning(Long count) {
        int[] result = {6, 5, 4, 3, 2, 1};
        return result[count.intValue() - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        LottoNumber lottoNumber = solution.new LottoNumber();
        int[] answer = solution.solution(lottoNumber.get_lottos(0), lottoNumber.get_win_nums(0));
//        int[] answer = solution.solution(lottoNumber.get_lottos(1), lottoNumber.get_win_nums(1));
//        int[] answer = solution.solution(lottoNumber.get_lottos(2), lottoNumber.get_win_nums(2));
        System.out.println(Arrays.stream(answer).sorted().mapToObj(String::valueOf).collect(Collectors.joining(", ")));

    }

    public class LottoNumber {
        private List<int[]> lottos;
        private List<int[]> win_nums;

        LottoNumber() {
            lottos = new LinkedList<>();
            win_nums = new LinkedList<>();

            //result : [3, 5]
            lottos.add(new int[]{44, 1, 0, 0, 31, 25});
            win_nums.add(new int[]{31, 10, 45, 1, 6, 19});

            //result : [1, 6]
            lottos.add(new int[]{0, 0, 0, 0, 0, 0});
            win_nums.add(new int[]{38, 19, 20, 40, 15, 25});

            //result : [1, 1]
            lottos.add(new int[]{45, 4, 35, 20, 3, 9});
            win_nums.add(new int[]{20, 9, 3, 45, 4, 35});


        }

        public int[] get_lottos(int index) {
            return lottos.get(index);
        }

        public int[] get_win_nums(int index) {
            return win_nums.get(index);
        }

    }

}
