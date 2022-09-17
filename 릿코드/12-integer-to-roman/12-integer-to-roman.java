class Solution {
    public String intToRoman(int num) {
        Stack<Integer> stack = new Stack<>();
        int count = 10;
        stack.push(num%count);
        while(num/count > 0) {
            stack.push(((num/count)%10) * count);
            count *= 10;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()) {
            sb.append(roman(stack.pop()));
        }
        return sb.toString();
    }
    public String roman(int num) {
        if(num/1000 > 0) {
            StringBuilder sb = new StringBuilder();
            for(int i=0, len=num/1000; i<len; i++) {
                sb.append("M");
            }
            return sb.toString();

        }else if(num/100 > 0) {
            num/=100;
            switch (num) {
                case 9 : return "CM";
                case 4 : return "CD";
            }
            StringBuilder sb = new StringBuilder();
            if(num >= 5) {
                sb.append("D");
                num-=5;
            }
            for(int i=0; i<num; i++) {
                sb.append("C");
            }
            return sb.toString();

        }else if(num/10 > 0) {
            num/=10;
            switch (num) {
                case 9 : return "XC";
                case 4 : return "XL";
            }
            StringBuilder sb = new StringBuilder();
            if(num >= 5) {
                sb.append("L");
                num-=5;
            }
            for(int i=0; i<num; i++) {
                sb.append("X");
            }
            return sb.toString();
        }else if(num > 0) {
            switch (num) {
                case 9 : return "IX";
                case 4 : return "IV";
            }
            StringBuilder sb = new StringBuilder();
            if(num >= 5) {
                sb.append("V");
                num-=5;
            }
            for(int i=0; i<num; i++) {
                sb.append("I");
            }
            return sb.toString();
        }
        return "";
    }
}