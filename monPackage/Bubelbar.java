




public class Bubelbar {
   
    public static void main(String []args ) {

        int arr[] = new int[]{29,2,49,1,5,13,1,39,40,27,8,39,23,11};
       
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
        for(int j = 0; i < n-1-1; j++) {

      if(arr[j] > arr[j+1]){

    
    int temporaire = arr[i];
    arr[j] = arr[j+1];
    arr[j+1] = temporaire;

}

        }
        }


for (int item:arr){
System.out.print(item+",");

    }




}
}