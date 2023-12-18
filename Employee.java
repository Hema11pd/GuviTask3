package GuviTask3;

public class Employee implements Taxable{
      int empId;
      String name;
      double salary;
      public Employee(int empId,String name,double salary )
      {
          this.empId = empId;
          this.name  = name;
          this.salary = salary;
      }

    @Override
    public void calcTax() {
        double yearlyTax = incomeTax *salary;
        System.out.println("Employee: "+empId+" Name: "+name+" Salary: "+salary);


    }
}
