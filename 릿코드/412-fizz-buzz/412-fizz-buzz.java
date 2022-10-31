class Solution {
    public List<String> fizzBuzz(int n) {
        return new ArrayList<>(){{
                    for(int i=1; i<=n; i++) {
                        if(i % 3 == 0 && i % 5 == 0) add("FizzBuzz");
                        else if(i % 3 == 0) add("Fizz");
                        else if(i % 5 == 0) add("Buzz");
                        else add(String.valueOf(i));
                    }
                }};
    }
}