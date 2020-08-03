class Utility<T> {
    
    static <T> void genericDisplay(T element[]){
        
         for(int i=0;i<element.length;i++)
            System.out.println(element[i]);
         
    }
    public static <T extends Comparable<T>> int linearSearch(T[] array,T value){
        for(int i=0;i<array.length;i++){
            if(array[i].equals(value))
                return i;
        }
        return -1;
    }
     
    static<T extends Comparable<T>> int binarySearch(T[] array, T value){
    
        int     low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = array[mid];  
            

            if (array[mid].compareTo(value) < 0) {
                low = mid - 1;
            }   

            else if (array[mid].compareTo(value) > 0) {
                high = mid  + 1; 
            }
            else    
                return mid;
        }

        return -1;

    }
    <T extends Comparable<T>> void  bubbleSort(T arr[]) {
            int n = arr.length;
            for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
              if (arr[j].compareTo(arr[j+1])> 0) {
              T temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }
        }
    }
    
}
}