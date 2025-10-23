package boj.problem;


import java.text.SimpleDateFormat;
import java.util.Date;

public class B5_10699_오늘_날짜 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
    }
}
