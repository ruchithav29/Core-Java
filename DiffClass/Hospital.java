class Hospital
{
	static String departments[] ={"General Medicine","OT","ICU","General Ward","Dermatologist","ENT","Urology","Psychiatry","Cardiology"};
	public static void getDepartments()
	{   
	System.out.println("get departments invoked : ");
	for(String department : departments){
		System.out.println(department);
	}
	System.out.println("end of the departments");
}
}
