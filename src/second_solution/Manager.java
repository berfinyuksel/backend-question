package second_solution;

public class Manager implements Role {

    @Override
    public void perform() {
        System.out.println("Managing the team.");
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
