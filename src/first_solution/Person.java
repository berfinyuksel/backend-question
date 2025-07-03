package first_solution;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private final String name;
    private final Set<Role> roles = new HashSet<>();

    public Person(String name) {
        this.name = name;
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    public void work() {
        for (Role role: roles) {
            role.perform();
        }
    }

    public String getName() {
        return name;
    }

    public Set<Role> getRoles() {
        return roles;
    }
    
}
