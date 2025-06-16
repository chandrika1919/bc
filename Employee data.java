class StuData {
     String name="chandrika";
     int roll=3;
     String branch="CSE";
     float cgpa=8.5f;
 }
 class Employee {
     String name="chandu";
     String role="python dev";
     int id=1919;
     float salary=1000000.9f;
 }
 class Main {
     public static void main(String[] args) {
         Employee e=new Employee();
         System.out.println("Name:"+e.name);
         System.out.println("Role:"+e.role);
         System.out.println("id:"+e.id);
         System.out.println("salary:"+e.salary);
     }
 }
