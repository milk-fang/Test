package DateClass;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * 类描述
 *
 * @ClassName DateTest
 * @Description TODO
 * @Author vip
 * @Date 2020/9/16 16:13
 * @Version 1.0
 */
public class DateTest {
    @Test
    public void test01(){
        //now
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //of
        LocalDate localDate1 = LocalDate.of(2021, 9, 15);
        System.out.println(localDate1);
        //getXxx

        //getDayOfMonth
        //getDayOfWeek
        //getMonth
        //getMonthValue
        //getMinute

        //with修改
        LocalDate localDate2 = localDate.withDayOfMonth(15);
        System.out.println(localDate2);

        LocalDate localDate3 = localDate.plusMonths(5);
        System.out.println(localDate3);
        LocalDate localDate4 = localDate3.minusMonths(5);

        System.out.println(localDate4);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str4 = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(str4);
        TemporalAccessor parse = dateTimeFormatter.parse(str4);
        System.out.println(parse);

    }
}
