package Week1.y2024.section3;

public class ContainerWithMostWater_BruteForceSolution {

    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        System.out.println("area: " + maxArea(input));
    }

    public static int maxArea(int[] inputArr) {
        int area = 0, maxArea = 0, width = 0, length = 0;

        for(int i=0; i < inputArr.length; i++){
            for(int j=i; j<inputArr.length; j++){
                length = inputArr[i] < inputArr[j] ? inputArr[i] : inputArr[j];
                width = j - i;
                area = length * width;
                if(maxArea < area) maxArea = area;
            }
        }
        return maxArea;
    }

    //public static int calculateArea(int[] inputArr )
}
