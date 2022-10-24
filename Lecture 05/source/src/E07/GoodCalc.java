package E07;

abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

public class GoodCalc extends Calculator{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum / a.length;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c[] = {1, 2, 3};

        GoodCalc gc = new GoodCalc();
        System.out.println("a + b = " + gc.add(a, b));
        System.out.println("a - b = " + gc.subtract(a, b));
        System.out.println("average = " + gc.average(c));
    }
}
