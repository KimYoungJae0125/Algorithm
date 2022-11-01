import java.time.LocalDateTime;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String week = "";
        switch (LocalDateTime.of(year, month, day, 0, 0).getDayOfWeek().getValue()) {
            case 7 : week = "Sunday"; break;
            case 1 : week = "Monday"; break;
            case 2 : week = "Tuesday"; break;
            case 3 : week = "Wednesday"; break;
            case 4 : week = "Thursday"; break;
            case 5 : week = "Friday"; break;
            case 6 : week = "Saturday"; break;
        };
        return week;
    }
}