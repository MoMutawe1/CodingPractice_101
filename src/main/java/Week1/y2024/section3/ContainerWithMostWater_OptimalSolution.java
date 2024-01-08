package Week1.y2024.section3;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater_OptimalSolution {


    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        System.out.println("area: " + maxArea(input));
    }

    public static int maxArea(int[] input) {

        int start = 0;
        int end = input.length-1;
        int area = 0, maxArea = 0;

        while(start < end) {
            if(input[start] >= input[end]) {
                area = calculateArea(input[start], input[end], start, end);
                if(maxArea<area) maxArea=area;
                end--;
            } else {
                area = calculateArea(input[start], input[end], start, end);
                if(maxArea<area) maxArea=area;
                start++;
            }
        }
        return maxArea;
    }

    public static int calculateArea(int l_start, int l_end, int w_start, int w_end){
        int area = 0, length = 0, width = 0;
        length = l_start > l_end ? l_end : l_start;
        width = w_end - w_start;
        area = length * width;
        return area;
    }
}
