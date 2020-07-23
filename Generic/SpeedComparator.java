package Generic;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		
		return o2.speed-o1.speed;
	}
	

}
