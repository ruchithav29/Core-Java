class AirPods2{
	static	String brand;
    static  String model;
    static  String color;
    static  int batteryLife;     
    static  int warranty;       
    static  double price;  
    static  long productId;
    static  boolean isAvailable;

    public static void main(String[] AirPods2) {
		brand = "JBL";
		System.out.println("Brand: " + brand);
		model = "AirPods";
        System.out.println("Model: " + model);
		color = "Black";
        System.out.println("Color: " + color);
		batteryLife = 42; 
        System.out.println("Battery Life: " + batteryLife);
		warranty = 12;
        System.out.println("Warranty: " + warranty);
		price = 1499.0;
        System.out.println("Price: " + price);
		productId = 12345678901L;
        System.out.println("Product ID: " + productId);
		isAvailable = true;
        System.out.println("Available: " + isAvailable);
    }
}