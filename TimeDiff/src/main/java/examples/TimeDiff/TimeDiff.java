package examples.TimeDiff;

//import java.util.Calendar;
//import java.util.Date;
//import java.io.*;
import java.util.*;

public class TimeDiff 
{
    public static void main( String[] args ) throws InterruptedException 
    {
    	/* Дата, которую сохранили */
        Calendar SaveData = Calendar.getInstance();

        /* промежуток: тест - 6 секунд */
        Thread.sleep(6000);

        /* текущая дата */
        Calendar CurrentData = Calendar.getInstance();

        /* вычисляем */
        Calendar calculate = Calendar.getInstance();
        calculate.setTime(new Date(CurrentData.getTime().getTime() - SaveData.getTime().getTime()));

        /* Здесь станцуем с бубном, мы получим количество часов, поэтому ручками */
//        System.out.println(((calculate.get(Calendar.DAY_OF_YEAR) - 1 ) * 24)  + (calculate.get(Calendar.HOUR_OF_DAY) - 11) + ":" + 
 //               calculate.get(Calendar.MINUTE) + ":" + calculate.get(Calendar.SECOND));
        
		long callTime = System.nanoTime();

    }
}
