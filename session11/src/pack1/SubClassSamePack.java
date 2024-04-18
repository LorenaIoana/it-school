package pack1;

public class SubClassSamePack {

    public static void main(String[] args) {
        SuperClass supprClass = new SuperClass();
        //superClass.privateMethod();
        supprClass.defaultMethod();
        supprClass.protectedMethod();
        supprClass.publicMethod();
    }
}
