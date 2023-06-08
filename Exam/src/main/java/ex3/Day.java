package ex3;

public class Day {
    public void date(int year,int month,int day){    //参数年月日
        System.out.println(year+"年"+month+"月"+day+"日是当年的第"+(month*30+day)+"天");
    }

    public static void main(String[] args) {
        Day day = new Day();
        day.date(2018,5,2);
    }
}
