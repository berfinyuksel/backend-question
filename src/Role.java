public interface Role {
    void perform();

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
    
}
