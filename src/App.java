import java.util.Arrays;

public class App {

  // in-place
  // public static Object[] rotateRight(Object[] arr) {
  // Object temp = arr[arr.length-1];
  // for(int i=arr.length-1;i>0;i--) {
  // arr[i]=arr[i-1];
  // }
  // arr[0]=temp;
  // return arr;
  // }

  // new array
  public static Object[] rotateRight(Object[] arr) {
    if (arr==null) {
      return null;
    }
    
    Object[] res = new Object[arr.length];
    for (int i = 0; i < arr.length; i++) {
      res[(i + 1) % res.length] = arr[i];
    }
    return res;
  }

  public static void main(String args[]) {
    Object[] arr = new Integer[] { 1, 2, 3, 4, 5 };

    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));

    Object[] arr2 = new String[] { "Hello", "there", "my friend" };

    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}