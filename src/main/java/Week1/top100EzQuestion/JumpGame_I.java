package Week1.top100EzQuestion;

//https://leetcode.com/problems/jump-game/
public class JumpGame_I {

    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        int[] arr2 = {2,0,0};
        System.out.println(canJump2(arr));
    }

    public static boolean canJump1(int[] nums) {
        int reachable = 0;
        for(int i=0; i < nums.length; i++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }


    // [1,0,1,0]
    //int[] arr = {3,2,1,0,4};
    public static boolean canJump2(int[] nums) {
        if(nums.length==1) return true;

        int goal = 0;
        for(int i=0; i< nums.length-1; i++){
            goal = Math.max(goal, i + nums[i]);
            if(nums[i]==0 && goal<=i) return false;
            if(goal>= nums.length-1) return true;
        }
        return false;
    }
}
