package Lec8_Stack;

public class StackUQueuepopE {

	private DynamicQueue primaryQueue = new DynamicQueue();

	public void push(int item) throws Exception {

		DynamicQueue helper = new DynamicQueue();

		try {

			helper.enqueue(item);
			while (!primaryQueue.isEmpty()) {
				// for (int i = 0; i < primaryQueue.size(); i++) {
				int temp = primaryQueue.dequeue();
				helper.enqueue(temp);
			}

			primaryQueue = helper;

		} catch (Exception e) {
			throw new Exception("Stack is Full.");
		}

	}

	public int pop() throws Exception {

		try {
			return this.primaryQueue.dequeue();
		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}

	}
	public void display() throws Exception {
		System.out.println("---------");
		display(0);
		System.out.println("---------");
	}

	private void display(int count) throws Exception {

		if (count == primaryQueue.size()) {
			return;
		}

		int temp = primaryQueue.dequeue();
		primaryQueue.enqueue(temp);

		display(count + 1);

		System.out.println(temp);
	}
}
