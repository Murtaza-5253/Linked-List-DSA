package Array;

public class one
{

    public static void main(String[] args) {
        int[] a;

        a = new int[8];

        System.out.println("Array before");
        display(a);

        for(int i=0;i<a.length;i++){
            System.out.println("Adding "+i+" at index "+i);
            a[i]=i;
        }
        System.out.println();
        System.out.println("Array after");
        display(a);

//insertion
        int index=7;
        a[index]=20;
        display(a);

        //searching
        int value=4;
        for(int i:a){
            if(a[i]==value){
                System.out.println("Found at index "+i);
                break;
            }
        }
    }
    public static void display(int[] arr){
        System.out.println("Array:- ");
        for (int j : arr) {
            System.out.println(" " + j);
        }
        System.out.println();
    }



}
