package College.assignment;

class A {
    public void methodA() {
        System.out.println("Base Class");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("Child Class");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        B obj = new B();
//        Calling super class method
        obj.methodB();
//        Calling child class method
        obj.methodA();
    }
}
