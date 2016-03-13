/* Author: Manas Sharma
 * Description: Shows the map object usage
 */
public class ImplementationUsage {

	private static Map myMap = new Map();

	public static void main(String[] args) {
		myMap.put(5, "Hello");
		myMap.put(4, "It's me");
		myMap.put(3, "I was wondering");
		myMap.put(2, "If after all these years");
		myMap.put(1, "You'd like to meet!");

		System.out.println(myMap.getVal(1));
		System.out.println(myMap.getVal(5));
		System.out.println(myMap.getVal(15));
	}

}
