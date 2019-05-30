import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
		
		public static void main(String[] args) {
			SubArraySumEqualsK obj = new SubArraySumEqualsK();
			int arr[] = new int[3];
			arr[0]=1;
			arr[1] = 1;
			arr[2] =1;
		int result = 	obj.subarraySum(arr, 2);
		System.out.println(result);
		}
	
	    public int subarraySum(int[] nums, int k) {
	        int sum = 0, result = 0;
	        Map<Integer, Integer> preSum = new HashMap<>();
	        preSum.put(0, 1);
	        
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if (preSum.containsKey(sum - k)) {
	                result += preSum.get(sum - k);
	            }
	            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
	        }
	       
	        return result;
	    
	}
}
