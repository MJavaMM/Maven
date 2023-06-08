package ex11;

public class SalesEmployee extends Employee{   //销售人员
    private double monthSales;   //月售额
    private double up;  //提成率

    public SalesEmployee(double monthSales, double up) {
        this.monthSales = monthSales;
        this.up = up;
    }

    public SalesEmployee(String name, String birthday, double monthSales, double up) {
        super(name, birthday);
        this.monthSales = monthSales;
        this.up = up;
    }
    public void getSalary(int month){
        double salary=monthSales*up;
        System.out.println("工资为"+salary);
    }

    public double getMonthSales() {
        return monthSales;
    }

    public void setMonthSales(double monthSales) {
        this.monthSales = monthSales;
    }

    public double getUp() {
        return up;
    }

    public void setUp(double up) {
        this.up = up;
    }
}
