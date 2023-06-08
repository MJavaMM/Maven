package ex11;

public class SalariedEmployee extends Employee{  //拿固定工资的员工
    private double monthSalary;
    public void getSalary(int month){
        double salary=monthSalary*month;
        System.out.println("工资为："+salary);
    }

    public SalariedEmployee(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public SalariedEmployee(String name, String birthday, double monthSalary) {
        super(name, birthday);
        this.monthSalary = monthSalary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;

    }
}
