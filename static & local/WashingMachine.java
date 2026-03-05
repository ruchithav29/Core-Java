class WashingMachine
{
	static String productName="LG 6 kg WashingMachine";	
	static String productDimensions="50D x 65W x 80H Centimeters";	
	static String brand="LG";	
	static String capacity="6 Kilograms";	
	static String specialFeature="Hygiene Steam, Inverter";	
	static String accessLocation="Front Load"; 

	public static void main(String[] args)
	{
		String productName="Samsung 7 kg WashingMachine";   
		System.out.println("Product Name:"+productName);
		System.out.println("Product Name:"+WashingMachine.productName);
		
		String productDimensions="55D x 60W x 85H Centimeters";
		System.out.println("productDimensions:"+productDimensions);
		System.out.println("productDimensions:"+WashingMachine.productDimensions);
		
		String brand="Samsung";
		System.out.println("brand:"+brand);
		System.out.println("brand:"+WashingMachine.brand);
		
		String capacity="7 Kilograms";
		System.out.println("capacity:"+capacity);
		System.out.println("capacity:"+WashingMachine.capacity);
		
		String specialFeature="Child Lock, Diamond Drum, Hygiene Steam, Inverter, Quick Wash";
		System.out.println("specialFeature:"+specialFeature);
		System.out.println("specialFeature:"+WashingMachine.specialFeature);
		
		String accessLocation="Top Load";
		System.out.println("accessLocation:"+accessLocation);
		System.out.println("accessLocation:"+WashingMachine.accessLocation);
	}
}