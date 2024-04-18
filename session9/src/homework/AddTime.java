package homework;

import java.time.LocalDateTime;

public class AddTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime newTime = current.plusHours(5).plusMinutes(30);
        System.out.println("After adding 5 hours and 30 minutes: "+newTime);
    }
}
