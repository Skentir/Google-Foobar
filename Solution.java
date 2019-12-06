public class Solution {
    public static int solution(int n) {
      double sqrt5 = Math.sqrt(5);
      double fibn = Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
    }
    public static void main (String[] args)
    {
      System.out.println(solution(2));
      System.out.println(solution(50));
      System.out.println(solution(100));
      System.out.println(solution(150));
      System.out.println(solution(200));
    }
}
