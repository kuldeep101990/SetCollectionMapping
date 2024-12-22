package setCollection;

import java.util.Set;

public class Department {
    private Long id;
    private String name;
    private Set<String> employeeNames;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getEmployeeNames() {
        return employeeNames;
    }

    public void setEmployeeNames(Set<String> employeeNames) {
        this.employeeNames = employeeNames;
    }
}
