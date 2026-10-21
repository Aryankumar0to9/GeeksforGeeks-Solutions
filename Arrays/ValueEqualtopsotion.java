import java.util.ArrayList;

class ValueEqualtopsotion {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 3, 4, 4, 5};

        ArrayList<Integer> ans = valEqualToPos(arr);

        System.out.print(ans);
        }
    }
