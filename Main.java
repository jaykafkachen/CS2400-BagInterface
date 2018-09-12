public class Main
{
    public static void main(String[] args)
    {
    	// write your code here
    	BagInterface<Integer> bg = new LinkedBag<Integer>();
    	System.out.println("Is empty: " + bg.isEmpty());
    	System.out.println("Adding entries...");
    	bg.add(4);
    	bg.add(25);
    	bg.add(70);
    	bg.add(38);
    	bg.add(123);
    	bg.add(5);
    	bg.add(70);
    	bg.add(70);
    	bg.add(52);
    	bg.add(35);
    	Object arr[] = bg.toArray();
    	System.out.println("Number of entries: " + bg.getCurrentSize());
    	System.out.println("Is empty: " + bg.isEmpty());
    	System.out.print("To array: ");
    	for(int i=0;i<arr.length;++i)
    		System.out.print(arr[i]+" ");
    	
    	System.out.println("\n\nRemoving random...");
    	System.out.println("Object removed: " + bg.remove().toString());
    	arr = bg.toArray();
    	System.out.print("To array: ");
    	for(int i=0;i<arr.length;++i)
    		System.out.print(arr[i]+" ");
    		
    	System.out.println("\n\nRemoving existing object in first position (52): " + bg.remove(52));
    	System.out.println("Number of entries: " + bg.getCurrentSize());
    	arr = bg.toArray();
    	System.out.print("To array: ");
    	for(int i=0;i<arr.length;++i)
    		System.out.print(arr[i]+" ");
    	
    	System.out.println("\n\nRemoving non-existing object (100): " + bg.remove(100));
    	System.out.println("Number of entries: " + bg.getCurrentSize());
    	arr = bg.toArray();
    	System.out.print("To array: ");
    	for(int i=0;i<arr.length;++i)
    		System.out.print(arr[i]+" ");
    	
    	System.out.print("\n\nRemoving existing object (5): "); 
    	System.out.println(bg.remove(5));
    	System.out.println("Number of entries: " + bg.getCurrentSize());
    	arr = bg.toArray();
    	System.out.print("To array: ");
    	for(int i=0;i<arr.length;++i)
    		System.out.print(arr[i]+" ");

      System.out.print("\n\nRemoving existing object at end (4): "); 
    	System.out.println(bg.remove(4));
    	System.out.println("Number of entries: " + bg.getCurrentSize());
    	arr = bg.toArray();
    	System.out.print("To array: ");
    	for(int i=0;i<arr.length;++i)
    		System.out.print(arr[i]+" ");
    	
    	System.out.println("\n\nContains existing object (70): " + bg.contains(70));
    	System.out.println("Contains non-existing object (5): " + bg.contains(5));
    	System.out.println("Frequency of 70 (=3): " + bg.getFrequencyOf(70));
    	System.out.println("Frequency of 100 (=0): " + bg.getFrequencyOf(100) + "\n");
    	
    	arr = bg.toArray();
    	System.out.print("To array: ");
    	for(int i=0;i<arr.length;++i)
    		System.out.print(arr[i]+" ");
    	System.out.println("\nClearing...");
    	bg.clear();
    	System.out.println("Is empty: " + bg.isEmpty());
    	System.out.println("Number of entries: " + bg.getCurrentSize());
    	arr = bg.toArray();
    	System.out.print("To array: ");
    	for(int i=0;i<arr.length;++i)
    		System.out.print(arr[i]+" ");
    }
}
