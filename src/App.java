public class App {
    public static void main(String[] args) throws Exception {

        Person alex = new Person("Alex");
        alex.addRole(new Role.Manager());
        alex.addRole(new Role.Trainer());
        
        Person abdul = new Person("Abdul");
        abdul.addRole(new Role.Manager());

        System.out.println("Alex's roles:" + alex.getRoles().toString());
    }
}
