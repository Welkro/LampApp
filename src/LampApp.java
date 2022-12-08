
public class LampApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lamp lamp1 = new Lamp("LED", true);   
		lamp1.printData();
		
		
		Lamp lamp2 = new Lamp("Lava");
		lamp2.printData();
		
		Lamp lamp3 = new Lamp("Halogen",true);
		lamp3.changeValues(false, "Neon");
		lamp3.printData();
		
		
		
		
	}

} // End of LampApp 


//Start of Lamp class
class Lamp {
	
	public boolean isOn;
	public String brand;
	
	//Default constructor
	public Lamp()
	{
		brand="";
		isOn = false;
	}
	
	// Parameterized constructors
	public Lamp(String brandName)
	{
		isOn = false;
		brand = brandName;
	}
	
	public Lamp(String brand, boolean isOn)
	{
		this.brand = brand;
		this.isOn = isOn;
	}
	
	//Methods for switching the lamp on and off 
	public void switchOn () 
	{
		isOn = true;
	}
	
	public void switchOff() 
	{
		isOn = false;
	}
	
	//Method for printing data
	public void printData()
	{
		System.out.println("Lamp");
		System.out.println("Brand: " + brand);
		if(isOn)
		{
			System.out.println("The lamp is lit!");
		}
		else
		{
			System.out.println("The lamp is off.");
		}
		
	}
	//Method for changing values
	public void changeValues(boolean isOn, String brand) {
     

		this.isOn = isOn; 
		this.brand = brand;
		
	}
	
 }
