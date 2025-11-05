package array.annonymus;

public class bubblesort {
    public static void main(String arg[]){
        int[] arr=new int[]{3,2,5,6,8,4,6,9};
        boolean flag=true;// if array is already sorted
        // System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<(arr.length)-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=false;
                }if(flag==true){
                    System.out.println("array already sorted");
                    return;
                }
            }
        }// display the  sorted array:
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
