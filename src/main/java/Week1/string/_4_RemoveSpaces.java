package Week1.string;

public class _4_RemoveSpaces {
    public static void main(String[] args) {
        System.out.println(removeAllWhiteSpaces("    H e l l o "));
        System.out.println(removeOuterSpaces("    H e l l o "));
    }

    public static String removeAllWhiteSpaces(String input) {
        StringBuilder result = new StringBuilder();
        for(char c: input.toCharArray())
            if(c!=' ') result.append(c);
        return result.toString();
    }

    public static String removeOuterSpaces(String input){
        int first = 0;
        int last = input.length()-1;
        StringBuilder result = new StringBuilder();
        char[] charArr = input.toCharArray();

        while(charArr[first]==' ')first++;
        while(charArr[last]==' ')last--;

        for(int i=first; i<=last; i++){
            result.append(charArr[i]);
        }
        return result.toString();
    }
}
