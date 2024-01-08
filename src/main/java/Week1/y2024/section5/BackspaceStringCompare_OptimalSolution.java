package Week1.y2024.section5;

import java.util.ArrayList;

public class BackspaceStringCompare_OptimalSolution {

    public static void main(String[] args) {
        String str1 = "bxj##tw", str2 = "bxo#j##tw";
        System.out.println(backspaceCompare(str1, str2));
    }

    public static boolean backspaceCompare(String str1, String str2) {
        ArrayList<Character> al1 = new ArrayList<>();
        ArrayList<Character> al2 = new ArrayList<>();

        int p1 = str1.length()-1, p2 = str2.length()-1;
        int flag1 = 0, flag2 = 0;

        while(p1 >= 0 || p2 >= 0) {
            if(p1 >= 0 && str1.charAt(p1)=='#') {
                flag1++;
                p1--;
            } else if (p1 >= 0 && str1.charAt(p1)!='#'){
                if(flag1==0) {
                    al1.add(str1.charAt(p1));
                    p1--;
                } else {
                    p1--;
                    flag1--;
                }
            }

            if(p2 >= 0 && str2.charAt(p2)=='#') {
                flag2++;
                p2--;
            } else if (p2 >= 0 && str2.charAt(p2)!='#'){
                if(flag2==0) {
                    al2.add(str2.charAt(p2));
                    p2--;
                } else {
                    p2--;
                    flag2--;
                }
            }
        }
        return al1.equals(al2) ? true : false;
    }
}
