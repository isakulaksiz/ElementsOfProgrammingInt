package primitiveTypes;

public class Palindrome {
    public static void main(String[] args){
        int x = 157751;
        System.out.println(isPallindromeNum(x));
    }
    public static boolean isPallindromeNum(int x){
        if(x<0)
            return false;
        final int numDigits = (int)(Math.floor(Math.log10(x))) +1;
        System.out.println(numDigits);
        int msdMask = (int)Math.pow(10, numDigits-1);
        System.out.println(msdMask);
        for(int i=0;i<numDigits/2;++i){
            if(x/msdMask != x%10)
                return false;
            x %= msdMask;
            x /= 10;
            msdMask /= 100;
        }
        return true;
    }
}
