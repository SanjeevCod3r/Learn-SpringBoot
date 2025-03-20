class Employee{
    String name;
    int age;
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class Parameterized2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sanjeev", 18);
        Employee e2 = new Employee("Rahul", 19);
        System.out.println(e1.name+" "+e1.age);
        System.out.println(e2.name+" "+e2.age);
    }
}
