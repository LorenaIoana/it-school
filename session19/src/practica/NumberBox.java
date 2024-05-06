package practica;

public class NumberBox <T extends Number> {
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setNumber(3);
        System.out.println(intBox.doubleValue());
    }
}
