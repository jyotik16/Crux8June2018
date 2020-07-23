package HashMap;

public class HeapClient {
public static void main(String[] args) {
	Heaptree hh = new Heaptree();
	hh.add(10);
	hh.add(5);
	hh.add(20);
	hh.add(25);
	hh.display();
	hh.add(30);
	hh.add(35);
	hh.add(15);
	hh.display();
	hh.remove();
	hh.remove();
	hh.remove();
	hh.display();
	hh.remove();
	hh.remove();
	hh.display();
	
}
}
