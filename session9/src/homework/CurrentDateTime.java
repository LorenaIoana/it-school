package homework;

import java.time.LocalDateTime;
import java.util.SortedMap;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current date and time: "+ current);
    }
}
