package day06;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("all")
public class Demo05 {
    public static void main(String[] args) {
        String rule = "yyyy-MM-dd HH:mm:ss";//创建转换规则
        DateFormat dateFormat = new SimpleDateFormat(rule);
        Date date = new Date();
        String now = dateFormat.format(date); //时间对象->字符串  format方法
        System.out.println(now);
        try {
            date = dateFormat.parse(now);//字符串->时间对象  parse方法  异常
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //实例化Calendar日期类对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //返回Data类型日期
        Date time = calendar.getTime();
        System.out.println(time);
        //获取年月日
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        //设置日期
        calendar.set(2019,12-1,20,11,30,30);
        Date date1 = calendar.getTime();
        System.out.println(time);

    }
}
