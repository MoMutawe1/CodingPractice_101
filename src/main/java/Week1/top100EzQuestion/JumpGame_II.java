package Week1.top100EzQuestion;

public class JumpGame_II {

    public static void main(String[] args) {
        int[] arr = {1,2,4,1,1,1,4};
        System.out.println(jump(arr));
    }

    public static int jump(int[] nums) {
        // The starting range of the first jump is [0, 0]
        int answer = 0;
        int curEnd = 0, curFar = 0;

        for (int i = 0; i < nums.length - 1; ++i) {
            // Update the farthest reachable index of this jump.
            curFar = Math.max(curFar, i + nums[i]);

            // If we finish the starting range of this jump,
            // Move on to the starting range of the next jump.
            if (i == curEnd) {
                answer++;
                curEnd = curFar;
                if(curEnd>= nums.length-1) return answer;
            }
        }

        return answer;
    }
}
