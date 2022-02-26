package primitiveTypes;

public class Pow {
    public static void main(String[] args){
        Pow pow = new Pow();
        double x = 2.0;
        int y = 2;
        double total = pow.power(x,y);
        System.out.println(total);
    }
    public static double power(double x, int y){
        double result = 1.0;
        long power = y;
        if(y<0){
            power = -power;
            x = 1.0 / x;
        }

        while(power!=0){
            if((power & 1) != 0){
                result *= x;
            }
            x *= x;
            power >>= 1;
        }
        return result;
    }
}
