package HashMap;

import java.util.ArrayList;

public class Heaptree {
ArrayList<Integer> data = new ArrayList<>();

public void add(int item) {
	data.add(item);
	upheapify(data.size()-1);
}

private void upheapify(int ci) {
	int pi=(ci-1)/2;
	if(data.get(pi)>data.get(ci)) {
		swap(pi,ci);
		upheapify(pi);
	}
	
}
private void swap(int pi, int ci) {
	int ith=data.get(pi);
	int jth=data.get(ci);
	data.set(pi,jth);
	data.set(ci,ith);
	
}
public int remove() {
	swap(0,data.size()-1);
	int rv=data.remove(data.size()-1);
	downheapify(0);
	return rv;
}

private void downheapify(int pi) {
	int lci=2*pi+1;
	int rci=2*pi+2;
	int mini=pi;
	if(lci<data.size() && data.get(lci)<data.get(mini)) {
		mini=lci;
		
	}
	if(rci<data.size() && data.get(rci)<data.get(mini)) {
		mini=rci;
		
	}
	if(mini!=pi) {
	swap(mini,pi);
	downheapify(mini);
	
}
}
public void display() {
System.out.println(data);	
}

public boolean isEmpty() {

	return this.size() == 0;
}

private int size() {

	return data.size();
}
public int get() {
	return data.get(0);
}
}