package ex11;

public class BasePlusSalesEmployee extends SalesEmployee{  //固定底薪的销售人员
    public double dixing;   //底薪

    public BasePlusSalesEmployee(double monthSales, double up, double dixing) {
        super(monthSales, up);
        this.dixing = dixing;
    }

    public BasePlusSalesEmployee(String name, String birthday, double monthSales, double up, double dixing) {
        super(name, birthday, monthSales, up);
        this.dixing = dixing;
    }

    public double getDixing() {
        return dixing;
    }

    public void setDixing(double dixing) {
        this.dixing = dixing;
    }
    public void getSalary(int month){
        double salary=dixing+super.getMonthSales()*super.getUp();
        System.out.println("工资为"+salary);
    }
}
