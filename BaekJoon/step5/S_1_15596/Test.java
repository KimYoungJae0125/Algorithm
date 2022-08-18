package BaekJoon.step5.S_1_15596;

public class Test {
    long sum(int[] a) {
        long ans = 0;
        for(int i=0; i<a.length; i++) {
            ans += a[i];
        }
        return ans;
    }

    //제한시간이 0.1초인 이유로 stream을 사용하면 시간 초과가 된다.
//    long sum(int[] a) {
//        return IntStream.range(0, a.length).map(i -> a[i]).sum();
//    }
}
