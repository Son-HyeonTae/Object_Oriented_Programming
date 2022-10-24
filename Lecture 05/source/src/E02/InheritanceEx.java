package E02;

class Person {
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int w) {
        this.weight = w;
    }

    public int getWeight() {
        return weight;
    }
}

class Student extends Person {
    void set() {
        age = 24;
        height = 175;
        name = "ABC";
        setWeight(65);
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
    }
}