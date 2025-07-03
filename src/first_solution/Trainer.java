package first_solution;

public class Trainer implements Role {
    
    @Override
    public void perform() {
        System.out.println("Training the team.");
    }

    @Override
    public String toString() {
        return "Trainer";
    }
    
}
