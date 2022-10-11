package P06;

import java.util.Scanner;

abstract class Calc {
    int a;
    int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int calculate();
}

class Add extends Calc {
    @Override
    public int calculate() {
        return a + b;
    }
}

class Sub extends Calc {
    @Override
    public int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    @Override
    public int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    @Override
    public int calculate() {
        return a / b;
    }
}

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();

        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String op = scanner.next();

        switch (op) {
            case "+":
                add.setValue(a, b);
                System.out.println(add.calculate());
                break;

            case "-":
                sub.setValue(a, b);
                System.out.println(sub.calculate());
                break;

            case "*":
                mul.setValue(a, b);
                System.out.println(mul.calculate());
                break;

            case "/":
                div.setValue(a, b);
                System.out.println(div.calculate());
                break;

            default:
                System.out.println("Error.");
        }

        scanner.close();
    }
}







