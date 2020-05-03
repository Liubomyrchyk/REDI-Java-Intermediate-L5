package lesson_five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson_five {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
	        pushZeroesAndOnes(arr);
	        System.out.println(Arrays.toString(arr));
	        
	        // subset
	        int[] array2={1,6,5,8};
	        int[] array1= {1,4,7,3,5,6};
	        isSubst(array1,array2);
	        
	        //cars Array
	        ArrayList<String> cars = new ArrayList<>();
	        cars.add("Volvo");
	        cars.add("BMW");
	        cars.add("Ford");
	        cars.add("Mazda");

	        for (String i : cars) {
	            System.out.println(i);
	        }
	        swapElements(cars,1,3);

	        for (String i : cars) {
	            System.out.println(i); 
	    }
	 }
	
	//push Zeroes and Ones
	public static void pushZeroesAndOnes(int[] array) {
        List<Integer> arrayList = new ArrayList<Integer>();
        System.out.println(Arrays.toString(array));
        int i=0;

        for ( i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                arrayList.add(0, array[i]);
            }
        }
        for ( i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 0) {
                arrayList.add(array[i]);
            }
        }
        for ( i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                arrayList.add(array[i]);
            }
        }
        for ( i = 0; i < array.length; i++) {
            array[i]=arrayList.get(i);
        }

    }

    //Swap two elements
    public static void swapElements(ArrayList<String> arrayList,int pos1, int pos2){
        if(arrayList.get(pos1)==null||arrayList.get(pos2)==null){
            System.out.println("The position is not Valid please choose another positions \n");

        }else{
            String temp=arrayList.get(pos1);
            arrayList.set(pos1, arrayList.get(pos2));
            arrayList.set(pos2,temp);
        }
        System.out.println("The elements at pos1 and pos2 are swapped \n");
    }

       
    // Subset
    private static boolean isSubst(int [] array1, int[] array2){
        int i=0;
        int j=0;
        int count=0;
        boolean isSub=false;
        for(i=0;i<array1.length;i++){
            for(j=0; j<array2.length;j++){
                if(array1[i]==array2[j])count++;
            }
        }
        if(count==array2.length){
            isSub=true;
            System.out.println("Yes, Array1 is subset of array2 \n");
        }
        count=0;
        for(i=0;i<array2.length;i++){
            for(j=0; j<array1.length;j++){
                if(array2[i]==array1[j])count++;
            }
        }
        if(count==array1.length){
            isSub=true;
            System.out.println("Yes, Array2 is subset of array1 \n");
        }
        if(isSub==false) System.out.println("None of the arrays are the other one's subset \n");
        	return isSub;
    }  
  }