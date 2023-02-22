public class DuplicateArray
{
    public static void main(String[] args) {
        int [] arr = new int [] {5, 1, 4, 6, 7, 3, 5, 7, 3};
        
        System.out.println("Display numbers with duplicate:");
        
        for (int i=0; i<arr.length; i++){
             for (int j= i+1; j<arr.length; j++){
                 if(arr[i] == arr[j]){
                     System.out.println(arr[j]);
                 }
             }
        }
    }
}
