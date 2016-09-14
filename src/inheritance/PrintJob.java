package inheritance;


public class PrintJob {
	public static void main(String[] args)
	{
		Printer<ColorCartridge> printer2 = new Printer<ColorCartridge>(true, "3456newprinter", ColorCartridge.RED);
		
		printer2.loadPaper(5);
		printer2.print(5);
		printer2.outPutPage(5);
	}
	
}




//This is the progression for inheritance / polymorphism / generics
////Printer is a child of Machine so we can create a machine instance and have it
////be of type Printer
//Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "12345myprinter", new BWCartridge());
//Printer<ColorCartridge> printer2 = new Printer<ColorCartridge>(true, "3456newprinter", ColorCartridge.RED);
//
//switch(printer2.getCartridge())
//{
//case BLUE:
//	System.out.println("Blue");
//	break;
//case RED:
//	System.out.println("RED");
//	break;
//case GREEN:
//	System.out.println("GREEN");
//	break;
//}
//
////how to iterate through an enum
//for(ColorCartridge cartridge : ColorCartridge.values())
//{
//	System.out.println(cartridge.printColor());
//}
//
//printer.loadPaper(10);
//printer.print(5);
//printer.outPutPage(4);
//System.out.println("");
//printer2.loadPaper(10);
//printer2.print(5);
//printer2.outPutPage(3);
//
////example of try / catch / finally
//
////printOne(printer);
////printOne(printer2);
////try 
////{
////	printer.print(-1);
////	
////}
////catch (IllegalArgumentException exception)
////{
////	System.out.println(exception.getMessage());
////}
////finally
////{
////	printer.turnOff();
////}
//	
////printer.turnOn();
////printer.print(1);
////printer.printUsingCartridge(new BWCartridge(), "Hey Hey");
//
////myPrinter.loadPaper(3);
////myPrinter.print(4);
////extend in the Printer class gives access to Machine class methods
////myPrinter.turnOff(); //turns printer off
////myPrinter.print(1);
//
//}
//
////<? extends ICartridge> is an example of wildcards.  
////this is used instead of using <T extends ICartridge> in Printer class
//public static void printOne(Printer<? extends ICartridge> printer)
//{
//String cartridgeType = printer.getCartridge().toString();
//System.out.println(cartridgeType);
//String fillPercentage = printer.getCartridge().getFillPercentage();
//System.out.println(fillPercentage);
//}