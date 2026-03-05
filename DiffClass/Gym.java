class Gym
{
	static String gymEquipments[] ={"Elliptical","AB Roller","Kettle Bell","Rowing Machine","tread Mill"};
	public static void getGymEquipments()
	{   
	System.out.println("get GymEquipments invoked : ");
	for(String gymEquipment : gymEquipments){
		System.out.println(gymEquipment);
	}
	System.out.println("end of the GymEquipments");
}
}
