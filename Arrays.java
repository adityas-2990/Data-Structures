public class Arrays {
    // To set the elements of an array to zero
    public static int[] Clear(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        n = 0;
        return arr;

    }

    public static int[] AddEle(int [] arr , int key , int pos){
        int [] new_arr = new int[arr.length+1];
        for (int i = 0; i < pos-1; i++) {
           new_arr[i] = arr[i];
        }
        new_arr[pos-1] = key;

        for (int i = pos; i < new_arr.length; i++) {
            new_arr[i] = arr[i-1];
        }
        return new_arr;
    }

    public static int [] RmEle(int [] arr , int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                arr[i] = arr[i+1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] A = {3 , 5 ,4 , 2,  7};
        int [] new_A = AddEle(A , 1 , 5);
        for (int i = 0; i < new_A.length; i++) {
            System.out.println(new_A[i]);
        }

    }
}
