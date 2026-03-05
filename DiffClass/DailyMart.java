class DailyMart
{
	static String vegetableNames[] = {"tomato","potato","onion","carrot","Binjal","Cabbage","Lady Finger"};
	public static void getVegetableNames()
	{   
	System.out.println("get vegetableName invoked : ");
	for(String vegetableName : vegetableNames){
		System.out.println(vegetableName);
	}
	System.out.println("end of the vegetableName ");
}
}
