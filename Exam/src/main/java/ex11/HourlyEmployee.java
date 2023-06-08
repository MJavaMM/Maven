package ex11;

public class HourlyEmployee extends Employee{
    private double hourSalary;  //每小时的工资
    private double hours;      //每月工作的小时数


    public HourlyEmployee(double hourSalary, double hours) {
        this.hourSalary = hourSalary;
        this.hours = hours;
    }

    public HourlyEmployee(String name, String birthday, double hourSalary, double hours) {
        super(name, birthday);
        this.hourSalary = hourSalary;
        this.hours = hours;
    }
    public void getSalary(int month){
        double salary = hourSalary*hours*month;
        System.out.println("工资为"+salary);
    }
}
