class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    int a []={i,j};
                    return a;
                }
            }
        }
        return null;
    }
}
public class Test 
{
    public static void main(String args[])
    {
        //case 1
        // int nums []={2,7,11,15};
        // int target =9;
        //case 2
        // int  nums []={3,2,4};
        // int target =6;
        //case 3
        int  nums []={3,3};
        int target =6;
        Solution s = new Solution();
        int a []=s.twoSum(nums,target); 
        System.out.println("The index number are "+a[0]+" and "+a[1]+" for target "+target);
    }
}
