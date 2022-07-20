import java.util.HashMap;
import java.util.Map;

class Demo01 {
    /*
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        return nums[n/2];
    }
    */
    public static Map<Integer,Integer> countMap(int[] nums){
        Map<Integer,Integer> count = new HashMap<Integer,Integer>();
        for(int i = 0;i < nums.length;i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i],1);
            }else{
                //map   输入put(key,value)  get(key)得到value
                count.put(nums[i],count.get(nums[i])+1);
            }
        }
        return count;
    }

    public static int majorityElement(int[] nums){
        Map<Integer,Integer> count = countMap(nums);
        int max = 0;
        int keys = 0;
        //Map.Entry<Integer,Integer> entry = count.entrySet();
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            if(entry.getValue() > max){
                keys = entry.getKey();
                max = entry.getValue();
            }
        }
        return keys;

    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int n = majorityElement(nums);
        System.out.println(majorityElement(nums));
    }
}
