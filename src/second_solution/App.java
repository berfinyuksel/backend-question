package second_solution;

public class App {
    public static void main(String[] args) {
        Person alex = new Person("Alex") {

            private final Role role = new Trainer();

            @Override
            public void work() {
                System.out.print(getName() + " is ");
                role.perform();
            }
        };

        Person sam = new Person("Sam") {

            private final Role role = new Manager();

            @Override
            public void work() {
                System.out.print(getName() + " is ");
                role.perform();
            }
        };

        alex.work();
        sam.work();
    }
}
