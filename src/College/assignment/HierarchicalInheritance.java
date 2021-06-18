package College.assignment;

class One {
    public void print_one() {
        System.out.println("Class one");
    }
}

class Two extends One {
    public void print_two() {
        System.out.println("Class two");
    }
}

class Three extends Two {
    public void print_three() {
        System.out.println("Class three");
    }
}

class Four extends Three {
    public void print_four() {
        System.out.println("Class four");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Two obj_two = new Two();
        obj_two.print_one();
        obj_two.print_two();

        Three obj_three = new Three();
        obj_three.print_one();
        obj_three.print_three();

        Four obj_four = new Four();
        obj_four.print_one();
        obj_four.print_four();
    }
}