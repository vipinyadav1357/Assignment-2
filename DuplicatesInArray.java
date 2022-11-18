import java.util.Vector;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int arr[] = { 12, 32, 12, 56, 12, 34, 34, 34, 34 };
        DuplicatesInArray obj = new DuplicatesInArray(arr);
    }

    Vector<Integer> v = new Vector<Integer>();

    DuplicatesInArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    v.add(arr[i]);
                    break;
                }
            }
        }
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.size(); j++) {
                if (i != j) {
                    if (v.elementAt(i).equals(v.elementAt(j)))
                        v.removeElementAt(j);
                }
            }
        }
        System.out.println("duplicates elements are " + v);
    }
}
