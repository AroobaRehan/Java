class Member{
    String Name;
    int age;
    String phone;
    String Address;
    int salary;

    public Member(String Name,int age,String phone,String Address,int salary){
        this.Name=Name;
        this.age= age;
        this.phone=phone;
        this.Address=Address;
        this.salary=salary;
    }

       public void printSalary(){
        System.out.println("Salary:"+salary);
    }
    public void printInfo(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+age);
        System.out.println("Phone:"+phone);
        System.out.println("Address:"+Address);
    }
}
class Manager extends Member{     //class Manager extends Member
    String department;
}
public class Employee extends Member{    //class Employee extends Member
    String specialization;

    public static void main(String[] args) {
        Employee Em1= new Employee(ahmed,23,0,11-Street,2300);
        Manager M = new Manager(john,34,390786,11-Street,4400);

        Em1.printSalary();
        Em1.printInfo();
        M.printSalary();
        M.printInfo();

    }
}