import java.util.*;

class Employee

{

    String name,addr,phone;

    int age,salary;

    void print_Salary(int salary)

    {

        System.out.println(salary);

    }

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        Officer o=new Officer();

        Manager m=new Manager();

        o.input();

        System.out.println("Enter the specialization:");

        o.specialization=sc.nextLine();

        m.input();

        System.out.println("Enter the department:");

        m.dept=sc.nextLine();

        o.details();

        System.out.print("Salary of officer:");

        o.print_Salary(o.salary);

        m.details();

        System.out.print("Salary of manager:");

        m.print_Salary(m.salary);

        sc.close();

    }

    void input()

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name:");

        name=sc.nextLine();

        System.out.println("Enter the address:");

        addr=sc.nextLine();

        System.out.println("Enter the phone no:");

        phone=sc.next();

        System.out.println("Enter the age:");

        age=sc.nextInt();

        System.out.println("Enter the salary:");

        salary=sc.nextInt();

    }

    void details()

    {

        System.out.println(name+" "+addr+" "+phone+" "+age);

    }

}

class Officer extends Employee{

    String specialization;

}

class Manager extends Employee

{

    String dept;

}
