class Solution {
    public boolean isAnagram(String s, String t) {
        return Arrays.stream(s.split("")).sorted().collect(Collectors.joining()).equals(Arrays.stream(t.split("")).sorted().collect(Collectors.joining()));
    }
}