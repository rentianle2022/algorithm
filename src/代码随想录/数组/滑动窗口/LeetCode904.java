package 代码随想录.数组.滑动窗口;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 904. 水果成篮
 */
public class LeetCode904 {

    public int totalFruit(int[] fruits) {
        int[] count = new int[fruits.length];
        int num = 0;
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < fruits.length) {
            count[fruits[right]]++;
            if (count[fruits[right]] == 1) {
                num += 1;
            }
            while (num > 2) {
                count[fruits[left]]--;
                if(count[fruits[left]] == 0){
                    num -= 1;
                }
                left++;

            }
            right++;
            max = Math.max(max, right - left);
        }
        return max;
    }
}
