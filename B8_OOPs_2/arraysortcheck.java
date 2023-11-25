package B8_OOPs_2;

public class arraysortcheck {
    public static void main(String[] args) {

        int [] arr = {1,2,3,7,9,4};
        System.out.println(sort(arr));

    }
    static boolean sort(int [] arr){
        int flag = 0;

        for (int i = 0 ; i <= arr.length - 2 ; i++){
            if(arr[i] <= arr[i + 1]) {
                flag++;
            }
            else{
                return false;
            }

        }
        if (flag == arr.length - 1){
            return true;
        }
        return false;
    }
}
