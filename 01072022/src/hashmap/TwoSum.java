package hashmap;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
public class TwoSum {
    public static void main(String[] args) {

    }
//
//    // найти 2 числа, которые в сумме дают это число и выводит их индексы
//    public static void main(String[] args) {
//        int[] nums = {2, 11, 7, 15, 5, 14};
//        int target = 16;
//
//        TwoSum twoSum = new TwoSum();
//        System.out.println(Arrays.toString(twoSum.twoSumWithHashMap(nums, target)));
//        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
//    }
//
//    private int[] twoSumWithHashMap(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i], i)) {
//                int key = target - nums[i];
//                if (map.containsKey(key))
//
//                    return new int[]{value, i};
//
//            }
//            int value = target - nums[i];
//            map.put(value, i);
//        }
//
//        return new int[]{-1, -1};
//    }
//
//    private int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            int first = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                int second = nums[j];
//                if (first + second == target) {
//                    return new int[]{i, j};
//                }
//
//            }
//        }
//        return new int[]{-1, -1};
//    }
}
