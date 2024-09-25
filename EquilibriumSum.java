public class EquilibriumSum {
    public static void equilibriumSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num; 
        }

        int leftSum = 0; 
        for (int i = 0; i < arr.length; i++) {
            leftSum+=arr[i];
            if(leftSum==totalSum){
                max = Math.max(max,leftSum);
            }
            totalSum-=arr[i];
        }
        System.out.println(max); 
    }

    public static void main(String[] args) {
        int[] arr = {1, -4, 7, 3, -2, 6};
        int[] arr1 = {-7, 1, 5, 2, -4, 3, 0};
        equilibriumSum(arr); 
        equilibriumSum(arr1); 
    }
}
