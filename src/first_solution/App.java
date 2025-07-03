package first_solution;

public class App {
    public static void main(String[] args) throws Exception {

        Person alex = new Person("Alex");
        alex.addRole(new Trainer());

        Person abdul = new Person("Abdul");
        abdul.addRole(new Manager());
        abdul.addRole(new Trainer());

        System.out.println("Alex's roles:" + alex.getRoles().toString());

        System.out.println(alex.getName() + " is working:");
        alex.work();
    }

}
