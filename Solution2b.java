public class Solution {
    public static int solution(int total_lambs) {
        int min =  minimumHench(total_lambs);
        int max = maximumHench(total_lambs);
        return max - min;
    }

    public static int minimumHench(int total_lambs) {
        int num = 0;
        int pay = 1;
        int sum = 0;
        while(true)
        {
            if (sum + pay > total_lambs)
                break;
            sum += pay;
            pay *= 2;
            num++;
        }
        return num;
    }

    public static int maximumHench(int total_lambs) {
        int num = 0;
        int pay = 1;
        int lastPay = 0;
        int sum = 0;
        int nextPay = 0;

        while(true)
        {
            if (sum + pay > total_lambs)
                break;
            sum += pay;
            nextPay  = pay + lastPay;
            lastPay = pay;
            pay = nextPay;
            num++;
        }
        return num;
    }
}
