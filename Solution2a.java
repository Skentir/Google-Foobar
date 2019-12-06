import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int solution(String n, int b) {
        ArrayList<String> buff = new ArrayList<String>();
        int k = n.length();

        while (true) {
            char[] y = n.toCharArray();
            Arrays.sort(y);
            char[] x = new char[k];
            int j = 0;
            for (int i = k-1; i >= 0 ; i--)
            {
                x[i] = y[j];
                j++;
            }
            char[] z = new char[k];
            for (int i = k-1; i >= 0; i--)
            {
                int diff = x[i] - y[i];
                if (diff < 0)
                {
                    diff+= b;
                    x[i-1]--;
                }
                z[i] = (char)(diff + '0');
            }
            n = new String(z);
            if (buff.contains(n))
                break;
            buff.add(n);
        }
        return buff.size() -buff.indexOf(n);
    }
}
