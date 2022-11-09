class Solution {
    public String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        String[] dateSplit = date.split(" "); 
        
        return  sb.append(dateSplit[2]).append("-")
                .append(getMonth(dateSplit[1])).append("-")
                .append(getDay(dateSplit[0])).toString(); 
    }
    private String getMonth(String month) {
        return switch(month) {
                    case "Jan" -> "01";
                    case "Feb" -> "02";
                    case "Mar" -> "03";
                    case "Apr" -> "04";
                    case "May" -> "05";
                    case "Jun" -> "06";
                    case "Jul" -> "07";
                    case "Aug" -> "08";
                    case "Sep" -> "09";
                    case "Oct" -> "10";
                    case "Nov" -> "11";
                    case "Dec" -> "12";
                    default -> "";
                };
    }
    private String getDay(String day) {
        day = day.replaceAll("[^\\d]", "");
        return day.length() == 1 ? "0" + day : day;
    }
}