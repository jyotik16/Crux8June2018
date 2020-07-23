 package Generic;

import java.util.Comparator;

import Generic.LinkedListGeneric;

public class GenericDemo {

	public static void main(String[] args) {
		Cars[] ar = new Cars[5];

//		for (Cars val : ar) {
//			System.out.println(val);
//		}
		
		ar[0]=new Cars(1000,245,"black");
		ar[1]=new Cars(4000,25,"red");
		ar[2]=new Cars(100,2450,"blue");
		ar[3]=new Cars(6000,645,"sliver");
		ar[4]=new Cars(500,2451,"grey");
//		for (Cars val : ar) {
//			System.out.println(val);
//		}
		display(ar);
		//Bubblesort(ar);
		System.out.println();
		//bubblesort(ar,new SpeedComparator());
		//bubblesort(ar,new PriceComparator());
		//bubblesort(ar,new Colorcomparator());
		LinkedListGeneric <Cars> ll =new LinkedListGeneric<>();
		ll.addFirst(new Cars(1000,245,"black"));
		ll.addFirst(new Cars(4000,25,"red"));
		ll.addFirst(new Cars(100,2450,"blue"));
		ll.addLast(new Cars(6000,645,"sliver"));
		ll.addLast(new Cars(500,2451,"grey"));
		ll.display();

	}
	public static <T> void display(T[] arr){
		for (T val : arr) {
			System.out.println(val);
		}
	}
	public static <T extends Comparable<T>> void Bubblesort(T[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
	}

	public static <T>void bubblesort(T[] arr,Comparator<T> CC) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(CC.compare(arr[j],arr[j+1])>0)
				{
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
