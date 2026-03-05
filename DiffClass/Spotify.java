class Spotify
{
	static String songNames[] ={"I think im addicted","NightTime","naane neenanthe","HeartBeat","DayLight","you & me","unstoppable"};
	public static void getSongNames()
	{   
	System.out.println("get songNames invoked");
	for(String songName: songNames){
		System.out.println(songName);
	}
	System.out.println("end of the songNames");
}
}
