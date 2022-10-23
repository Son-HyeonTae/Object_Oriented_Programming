package E10;

class Sample {
    public  int a;
    private int b;
    int c;
}

public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10; // public  : can use in same package
        // aClass.b = 10; // private : can't use in same package, only in same class
        aClass.c = 10; // default : can use in same package
    }
}
