package Week1.top100EzQuestion;

// https://leetcode.com/problems/robot-return-to-origin/
public class _10_RobotReturnToOrigin {
    public static void main(String[] args) {

        System.out.println(judgeCircle("UDLRR"));
    }

    public static boolean judgeCircle(String moves) {
        int verticalMove = 0;
        int horizontalMove = 0;

        for(char c: moves.toCharArray()){
            if(c == 'U')
                verticalMove++;
            else if(c == 'D')
                verticalMove--;
            else if(c == 'R')
                horizontalMove++;
            else
                horizontalMove--;
        }
        return verticalMove+horizontalMove != 0 ? false : true;
    }
}
