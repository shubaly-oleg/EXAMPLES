package examples.time.TimeDiff;

import java.util.concurrent.TimeUnit;

public class TimeDiff 
{
    public static void main( String[] args )
    {
//    	long t = System.nanoTime();
    	long t = 9999999523896752L;
    	System.out.println( t );
//    	System.out.println(TimeUnit.NANOSECONDS.toSeconds(t));

    	int ns = (int) (t % 1000);
    	System.out.println(ns + " ns");
    	
    	int mks = (int) ((t % 1000000 - ns) / 1000);
    	System.out.println(mks + " mks");
    	
    	int ms = (int) ((t % 1000000000 - (mks*1000 + ns)) / 1000000);
    	System.out.println(ms + " ms");
    	
    	long allSec = t / 1000000000 ;
//    	System.out.println("allSec = " + allSec);
    	
    	int s = (int) (allSec % 60);
    	System.out.println(s + " s");
    	
    	int allMin = (int) (allSec / 60);
//    	System.out.println("allMin = " + allMin);
    	
    	int min = (int) (allMin % 60);
    	System.out.println(min + " min");
    	
    	int allHr = (int) (allMin / 60);
//    	System.out.println("allHr = " + allHr);
    	
    	int hr = (int) (allHr % 24);
    	System.out.println(hr + " hr");
    	
    	int ds = (int) (allHr / 24);
    	System.out.println(ds + " ds");
    	
    }
}
