public class Inssort {
    public static void InsertionSort(int []arr) {
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
                

            }
            arr[j+1]=temp;
            
        }
        
    }
    


public static void main(String[] args) {
    int []arr={8,7,9,4,6,5,1,2,3};
   InsertionSort(arr);
    for(int i:arr){
        System.out.println(i);
    }
}
}