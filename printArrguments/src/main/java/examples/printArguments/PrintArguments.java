package examples.printArguments;

public class PrintArguments 
{
    public static void main( String[] args )
    {
        int i = 0; 
    	for (String str : args) {
        	System.out.printf("Аргумент %02d -> %s%n", i++, str);
		}
    }
}
