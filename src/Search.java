import java.util.ArrayList;
import java.util.TreeSet;

public class Search {

	public static void main(String[] args) {
		TreeSet <Integer> x = new TreeSet <Integer>();
		x.add(5);
		x.add(1);
		x.add(7);
		System.out.println(x.descendingSet());
		System.out.println(x.last());

		ArrayList <String> y = new ArrayList <String>();
		y.add("Ryan");
		y.add("Luke");
		y.add("Jenn");
		System.out.println(y.indexOf("Luke"));
		
	}

}
