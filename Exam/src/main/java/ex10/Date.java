package ex10;

import java.text.SimpleDateFormat;

public class Date {
    public void date(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date date = new java.util.Date();
        System.out.println();
        String da = simpleDateFormat.format(date);
        System.out.println(da);
    }
    public void week(int year,int month,int day){
        System.out.println("是一年中的第"+((month*30+day)/30)+"个星期");
        int i=0;

    }


    public static void main(String[] args) {
        Date date = new Date();
        date.date();
        date.week(2015,4,6);
    }
}
