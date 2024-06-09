package umbrella.hospital.p04.system;

import java.util.Calendar;

public class GetDateInformation {
    private Calendar date = Calendar.getInstance();

    public String getYear() {
        return String.valueOf(date.get(Calendar.YEAR));
    }

    //Return string as format "Tue, 26 Nov"
    public String getDay() {
        String day = switch (date.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> "Sun";
            case 2 -> "Mon";
            case 3 -> "Tue";
            case 4 -> "Wed";
            case 5 -> "Thu";
            case 6 -> "Fri";
            case 7 -> "Sat";
            default -> "";
        };
        return day + ", " + date.get(Calendar.DAY_OF_MONTH) + " " + getMonth();
    }

    public String getMonth() {
        return switch (date.get(Calendar.MONTH)) {
            case 0 -> "Jan";
            case 1 -> "Feb";
            case 2 -> "Mar";
            case 3 -> "Apr";
            case 4 -> "May";
            case 5 -> "Jun";
            case 6 -> "Jul";
            case 7 -> "Aug";
            case 8 -> "Sep";
            case 9 -> "Oct";
            case 10 -> "Nov";
            case 11 -> "Dec";
            default -> "";
        };
    }

    public String monthStringToNum(String month){
        return switch (month) {
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

    //Get Time as format "HH:mm"
    public String getTime() {
        return date.get(Calendar.HOUR_OF_DAY) + ":" + date.get(Calendar.MINUTE);
    }

    //Get AM or PM
    public String getAMPM() {
        return date.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
    }
}
