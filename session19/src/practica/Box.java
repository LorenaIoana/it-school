package practica;

public class Box <T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setObj("Hello Generics");
        System.out.println(stringBox.getObj());
    }
}
