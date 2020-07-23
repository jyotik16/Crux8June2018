package assignments;

public class reverse_a_queue_Recurn {
	public class Queue {
		static Scanner scn=new Scanner(System.in);
		protected int[] data;
		protected int front;
		private int size;

		public Queue() {
			this.data = new int[5];
			this.front = 0;
			this.size = 0;
		}

		public int size() {
			return this.size;
		}

		public boolean isEmpty() {
			return this.size() == 0;
		}

		public void Enqueue(int item) throws Exception {
			if (this.size() == this.data.length) {
				int[] oa = this.data;
				int[] na = new int[2 * oa.length];
				// this.front=0;
				for (int i = 0; i < oa.length; i++) {
					int idx = (i + this.front) % this.data.length;
					na[i] = oa[idx];
				}
				this.data = na;
				this.front = 0;

			}
			int idx = (this.front + this.size) % this.data.length;
			this.data[idx] = item;
			this.size++;
		}

		public int dequeue() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Queue is Empty");
			}
			int rv = this.data[this.front];
			this.data[this.front] = 0;

			this.front = (this.front + 1) % this.data.length;
			this.size--;
			return rv;
		}

		public int getFront() throws Exception {
			if (this.size == 0) {
				throw new Exception("Queue is Empty");
			}
			int rv = this.data[this.front];
			return rv;
		}

		public void display() {
			System.out.println("----------------");
			for (int i = 0; i < this.size; i++) {
				int idx = (this.front + i) % this.data.length;
				System.out.print(this.data[idx] + " ");
			}
			System.out.println(".");
			System.out.println("-----------------");
		}

		public static void main(String[] args) throws Exception {
			Queue queue = new Queue();
			int n = scn.nextInt();
			for(int i=0;i<n;i++)
			{
				queue.Enqueue(scn.nextInt());
			}
			displayReverseQueue(queue, 0);
			System.out.print("END");

		}

		public static void displayReverseQueue(Queue q, int count) throws Exception {
			if (count == q.size()) {
				return;
			}
			int value = q.dequeue();
			q.Enqueue(value);
			displayReverseQueue(q, count + 1);
			System.out.print(value+" ");
		}

	}

}
