package Lec8_Stack;

public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
e
			for (int i = 0; i < oa.length; i++) {
				int idx = (i + this.front) % this.data.length;
				na[i] = oa[idx];
			}
			this.data = na;
			this.front = 0;

		}
		super.enqueue(item);

	}
	
	
}


