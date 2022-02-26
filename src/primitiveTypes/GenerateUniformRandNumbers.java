package primitiveTypes;

public class GenerateUniformRandNumbers {
    public static void main(String[] args){

    }
    public static int uniformRandom(int lowerBound, int upperBound){
        int numberOfOutcomes = upperBound - lowerBound + 1, result;
        do{
            result = 0;
            for(int i=0; (1 <<i) < numberOfOutcomes; ++i){
//                result = (result << 1) | zeroOneRandom();
                result = (result << 1);
            }
        }while(result >= numberOfOutcomes);
        return result + lowerBound;
    }
}
