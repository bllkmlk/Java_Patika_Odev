public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal",2000,45,1985);
        String EmployeString = employee.toString();
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        System.out.println(employee.toString());

    }
}