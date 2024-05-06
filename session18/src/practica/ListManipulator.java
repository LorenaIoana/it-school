package practica;

import java.util.ArrayList;
import java.util.List;

public class ListManipulator {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> evenNumberList = new ArrayList<>();
        for (Integer number : list) {
            if (number %2 == 0) {
                evenNumberList.add(number);
            }
        }
        return evenNumberList;
    }

    public Integer findMaximum(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }

        int max = list.get(0);
        for (Integer number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
