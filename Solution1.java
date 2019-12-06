import java.util.ArrayList;

public class Solution {
    public static int[] solution(int area) {
      ArrayList<Integer> results = new ArrayList<Integer>();
      while(area > 0) {
        int square = (int)Math.floor(Math.sqrt(area));
        square *= square;
        results.add(square);
        area -= square;
      }
      int[] arr = new int[results.size()];
      for (int i=0; i < results.size(); i++)
        arr[i] = results.get(i);
      return arr;
    }
}
