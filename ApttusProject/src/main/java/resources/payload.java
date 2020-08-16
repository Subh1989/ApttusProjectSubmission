package resources;

public class payload{

	public static String getPayload1()
	{
		String payload1= "{\r\n" + 
				"   \"external_id\": \"DEMO_TEST001\",\r\n" + 
				"   \"name\": \"Interview Station 500\",\r\n" + 
				"   \"latitude\": 33.33,\r\n" + 
				"   \"longitude\": -111.43,\r\n" + 
				"   \"altitude\": 444\r\n" + 
				"}";
		return payload1;
	}
	

	public static String getPayload2()
	{
		String payload2 = "{\r\n" + 
				"   \"external_id\": \"Interview1 \",\r\n" + 
				"   \"name\": \"Interview Station 501\",\r\n" + 
				"   \"latitude\": 33.44,\r\n" + 
				"   \"longitude\": -12.44,\r\n" + 
				"   \"altitude\": 444\r\n" + 
				"}";
		return payload2;
	}
}	
	