package ex01;

public class Ex02 {
    public static void main(String[] args) {
        // 리스트에서 두 요소의 합이 target이 되는 인덱스를 반환하시오.
        int arr[] = {4, 9, 7, 5, 1};
        int target = 14;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " +  arr[j]);
                }
            }
        }
    }
}
