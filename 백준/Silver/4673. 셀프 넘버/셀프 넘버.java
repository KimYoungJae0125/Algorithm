import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for(int i=0; i<10000; i++){
                a.add(i+1);
        }
        for(int i=1; i<=10000; i++) {
            new Main().selfNumber(i, a);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.size(); i++) {
            sb.append(a.get(i)).append("\n");
        }

        System.out.println(sb.toString());

    }

    void selfNumber(int n, List<Integer> selfNumber) {
        String nStr = String.valueOf(n);
        char[] nChar = nStr.toCharArray();
        Integer sum = n;
        for(int i=0, len=nChar.length; i<len; i++) {
            sum += Character.getNumericValue(nChar[i]);
        }
        if(selfNumber.remove(sum)){
            selfNumber(sum, selfNumber);
        }
    }
}
