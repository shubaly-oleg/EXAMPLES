package examples.time.nsParser;

public class Main 
{
    public static void main( String[] args ) throws InterruptedException
    {

    	nsParser t = new nsParser();
    	t.nsParse(86448003440940L);
    	System.out.println(t);
    	
    	long t1 = System.nanoTime();
    	Thread.sleep(6000);
    	long t2 = System.nanoTime();
    	t.nsParse(t2-t1);
    	System.out.println(t);
    	System.out.println(t.hr + " hr " + t.min + " min " + t.s + " s " + t.ms + " ms");
    	
//    	System.out.println(TimeUnit.NANOSECONDS.toSeconds(t));
    }
}
