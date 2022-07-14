package Lesson05.HomeWork;

public class Employee {
    public static void main(String[] args) {

        Employee [] employees = new Employee[5];

        employees[0] = new Employee("Vadim", "tester", "ivt@mail.ru", "114-23-56", 900, 32);
        employees[1] = new Employee("Yana", "petsitter", "kyana@tut.by", "132-14-08", 200, 26);
        employees[2] = new Employee("Petrova Olga Ivanovna", "administrator", "opetrova@gmail.com", "324-45-67", 1200, 45);
        employees[3] = new Employee("Ivanov Oleg Petrovich", "driver", "oivanov@yandex.ru", "566-45-78", 700, 50 );
        employees[4] = new Employee("Olgina Inna Andreevna", "seller", "innusik@gmail.com", "123-34-56", 500, 20);

        for(Employee test : employees) {
            if (test.age > 40) {
                test.printInfo();
                System.out.println();
            }

        }
    }

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
       this.fullName = fullName;
       this.position = position;
       this.email = email;
       this.phone = phone;
       this.salary = salary;
       this.age = age;
    }

    public void printInfo() {
        System.out.println("Full Name: " + fullName + "\n" +
                           "Position: " + position + "\n" +
                           "Email: " + email + "\n" +
                           "Phone: " + phone + "\n" +
                           "Salary: " + salary + "\n" +
                           "Age: " + age);
    }
}
