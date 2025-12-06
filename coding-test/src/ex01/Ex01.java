package ex01;

public class Ex01 {
    public static void main(String[] args) {
        // 리스트 [4,9,7,5,1]에서 주어진 target값과 일치하는 요소의 인덱스를 찾으세요.
        int arr[] = {4, 9, 7, 5, 1};
        int target = 5;

      for(int i=0; i<arr.length; i++){
          if(arr[i] == target) {
              System.out.println(arr[i]);
          }
      }

    }
}
