class Pots
{
	static String material="Plastic";
	static String colour="Brown Semi";
	static String specialFeature;
	static String style;
	static String planterForm="PlantPot";
	
	public static void main(String []pots){
	String material = "Plastic";
	System.out.println("material:"+material);
	System.out.println("material:"+Pots.material);
	
	colour ="Brown Semi";
	System.out.println("colour:"+colour);
	System.out.println("colour:"+Pots.colour);
	
	specialFeature ="Lightweight, UV Resistant";
	
	System.out.println("specialFeature:"+specialFeature);
	System.out.println("specialFeature:"+Pots.specialFeature); 
	
	style = "Set of 4";
	System.out.println("style:"+style);
	System.out.println("style:"+Pots.style);
	
	planterForm = "PlantPot";
	System.out.println("planterForm:"+planterForm);
	System.out.println("planterForm:"+Pots.planterForm);
	}
}