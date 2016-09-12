package inheritance;


public class PrintJob {
	public static void main(String[] args)
	{
		//Printer is a child of Machine so we can create a machine instance and have it
		//be of type Printer
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "12345myprinter", new BWCartridge());
		Printer<ColorCartridge> printer2 = new Printer<ColorCartridge>(true, "3456newprinter", new ColorCartridge());
		
		printer2.loadPaper(10);
		printer2.print(5);
		
		printer2.outPutPage(3);
		
		//example of try / catch / finally
		
//		printOne(printer);
//		printOne(printer2);
//		try 
//		{
//			printer.print(-1);
//			
//		}
//		catch (IllegalArgumentException exception)
//		{
//			System.out.println(exception.getMessage());
//		}
//		finally
//		{
//			printer.turnOff();
//		}
			
		//printer.turnOn();
		//printer.print(1);
		//printer.printUsingCartridge(new BWCartridge(), "Hey Hey");
		
		//myPrinter.loadPaper(3);
		//myPrinter.print(4);
		//extend in the Printer class gives access to Machine class methods
		//myPrinter.turnOff(); //turns printer off
		//myPrinter.print(1);
		
	}
	
	//<? extends ICartridge> is an example of wildcards.  
	//this is used instead of using <T extends ICartridge> in Printer class
	public static void printOne(Printer<? extends ICartridge> printer)
	{
		String cartridgeType = printer.getCartridge().toString();
		System.out.println(cartridgeType);
		String fillPercentage = printer.getCartridge().getFillPercentage();
		System.out.println(fillPercentage);
	}
	
}
