import java.util.ArrayList;
import java.util.List;

/* Author: Manas Sharma
 * Description: Simple hashmap implementation
 * 				that maps an integer key
 * 				to a string value. The map
 * 				returns an error code when
 * 				queried for non-existing keys
 * 		
 */
public class Map {

	private static List<Integer> keys = new ArrayList<Integer>();
	private static String[] values = new String[100000];

	public void put(Integer keyval, String val) {
		keys.add(keyval);
		int i = keys.size() - 1;
		int getHash = hashGen(i);
		values[getHash] = val;
	}

	public String getVal(Integer key) {
		int i;
		for (i = 0; i < keys.size(); i++) {
			if (keys.get(i).equals(key)) {
				int getHash = hashGen(i);
				String value = values[getHash];
				return value;
			}
		}
		return "No such key found!";
	}

	public int hashGen(int num) {
		return num % 100000;
	}

}
