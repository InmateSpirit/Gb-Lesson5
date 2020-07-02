package GeekBrains;

public class Worker {
    private String Name;
    private String Position;
    private String Email;
    private double Salary;
    private int PhoneNumber;
    public int Age;

    public Worker(String name, String position, String email, double salary, int phoneNumber, int age) {
        Name = name;
        Position = position;
        Email = email;
        Salary = salary;
        PhoneNumber = phoneNumber;
        Age = age;
    }
    public void Info(){
        System.out.println(String.format("Name: %s, Position: %s, Email: %s, Salary: %s, Phone: %s, Age: %s", Name, Position, Email, Salary, PhoneNumber, Age ));
    }
}
