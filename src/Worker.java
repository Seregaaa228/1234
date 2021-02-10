public class Worker {
    private String name;

    private int salary;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
