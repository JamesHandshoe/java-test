package inheritance;

import java.util.HashMap;
import java.util.Map;

//extends allows us to inherit from Machine
//public class Printer extends Machine // this makes Machine class the parent class of Printer

//implements allow us to interface with IMachine
//<T> this allows the class to take in a type 
public class Printer<T> implements IMachine
{
	//data or properties of our printer
	
	private String modelNumber;
	//example of composition - creating a papertray from PaperTray / machine from Machine
	//in this file we also use methods from PaperTray / Machine to work the printer
	//this is called delegation
	private PaperTray paperTray = new PaperTray();
	private Machine machine;
	private T cartridge; //this is creating the generic type of cartridge
	//private List<Page> pages = new ArrayList<Page>();
	private Map<Integer, Page> pagesMap = new HashMap<Integer, Page>();
	
	//methods
	
	public Printer(boolean isOn, String modelNumber, T cartridge)
	{
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
	}
	

	
	@Override  //this is how polymorphism is accomplished
	public void turnOn()
	{
		System.out.println("Printer is warming up");
		//delegation
		machine.turnOn();
	}
	@Override
	public void turnOff()
	{
		machine.turnOff();
	}
	
	
	public <U extends ICartridge> void printUsingCartridge(U cartridge, String message)
	{
		System.out.println(cartridge.getFillPercentage());
		System.out.println(message);
		System.out.println(cartridge.toString());
	}
	
	public void print(int copies)
	{
		checkCopies(copies);
		System.out.println(cartridge.toString());
		
		String onStatus = "";
		if(machine.isOn())
		{
			onStatus = " is On!";
		}
		else 
		{
			onStatus = " is Off!";
		}
		
		String textToPrint = modelNumber + onStatus;
		int pageNumber = 1;
	
		while( copies > 0 && paperTray.isEmpty() )
		{
			//pages.add(new Page(textToPrint));
			pagesMap.put(pageNumber, new Page(textToPrint + ":" + pageNumber));
			copies--;
			pageNumber++;
			paperTray.usePage();
		}
		
		if(!paperTray.isEmpty())
		{
			System.out.println("Load more paper");
		}
		
	}

	public void outPutPage(int pageNumber) 
	{
		System.out.print(pagesMap.get(pageNumber).getText());
	}
//	public void outPutPages()
//	{
//		for(Page currentPage : pages)
//		{
//			System.out.println(currentPage.getText());
//		}
//	}

	private void checkCopies(int copies) {
		if(copies < 0)
		{
			throw new IllegalArgumentException("Can't print less than zero copies");
		}
	}
	
	public void printColors()
	{
		String[] colors = new String[] {"Red", "Blue", "Green", "Orange", "Purple" };
		
		for( String currentColor : colors )
		{
			if("Red".equals(currentColor))
			{
				//break; // ends the loop once green is the value
				continue; //skips the condition then continues the loop - this will skip green
			}
			System.out.println(currentColor);
		}
	}

	public void loadPaper(int count) 
	{
		paperTray.addPaper(count);
	}

	@Override
	public boolean isOn() {
		return machine.isOn;
	}

	public T getCartridge() 
	
	{		
		return this.cartridge;

	}
			
}
