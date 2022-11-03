import java.time.LocalDateTime;

class Solution {
    public int dayOfYear(String date) {
        return LocalDateTime.of(Integer.parseInt(date.substring(0, 4)), Integer.parseInt(date.substring(5, 7)), Integer.parseInt(date.substring(8, 10)), 0, 0).getDayOfYear();
    }
}