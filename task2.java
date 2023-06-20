package java_projs.hwsem1;

public class task2 {
    public static void main(String[] args)
    {
        int sum = 0;
        Integer[] nums = { 1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0 };
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] < 0 && nums[i-1] > 0)
            {
                sum += nums[i-1];
            }
        };
        System.out.println(sum);
    }
}    

