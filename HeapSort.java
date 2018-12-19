
/*
 * use the heap code from previous lab
 */
public class HeapSort {

	public HeapSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("How many numbers you want to enter:");
		int N=input.nextInt();
		Integer array[]=new Integer[N];
		System.out.print("Enter numbers:");
		for(int i=0;i<N;i++)
			array[i]=input.nextInt();
		//================================
		System.out.println("Before Sorting:");
		for(int i=0;i<N;i++)
			System.out.print("\t"+array[i]);
		//--------function is called
		heapsort(array);
		//================================
		System.out.println("After Sorting:");
		for(int i=0;i<N;i++)
			System.out.print("\t"+array[i]);

	}
	//to be completed
	//use priority heap here
	public static void heapsort(Integer array[])
	{
		PriorityHeap<Integer> pHeap= new PriorityHeap<Integer>(array.length);
		for(int i=0;i<array.length;i++)
		pHeap.insert(array[i]);
		for(int i=0;i<array.length;i++){
			array[i]=pHeap.min();
			pHeap.delete();
		}
	}


}
