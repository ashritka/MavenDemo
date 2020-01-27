import com.google.gson.Gson;

public class Main {

	static String json = "{\"brand\":\"Jeep\", \"doors\": 3}";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gson gson = new Gson();

		Car car = gson.fromJson(json, Car.class);

		System.out.println("car - " + car);

	}

}
