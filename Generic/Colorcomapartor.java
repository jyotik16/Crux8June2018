package Generic;

import java.util.Comparator;

public class Colorcomapartor implements Comparator<Cars>{
	
	@Override
	public int compare(Cars o1, Cars o2) {
		
		return o1.compareTo(o2);
	}

}
