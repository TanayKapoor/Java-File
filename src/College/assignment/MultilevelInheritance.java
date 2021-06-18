package College.assignment;

class x {
    public void methodX() {
        System.out.println("Base Class");
    }
}

class y extends x {
    public void methodY() {
        System.out.println("Child Class 1");
    }
}

class z extends y {
    public void methodZ() {
        System.out.println("Child Class 2");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        z obj = new z();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}
