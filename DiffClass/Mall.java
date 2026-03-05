class Mall
{
	static String serviceNames[] ={"Personal Shopper","Valent Parking","Food Court","RestRooms","Baby Care Room","Free Wifi","Security Services"};
	public static void getServiceNames()
	{   
	System.out.println("get serviceNames invoked : ");
	for(String serviceName : serviceNames){
		System.out.println(serviceName);
	}
	System.out.println("end of the serviceNames");
}
}
