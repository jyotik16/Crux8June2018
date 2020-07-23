package CodeSimple;

public class AelementsinConsecutive {
// check if all elements of array are consecutive or not.
    public boolean areConsecutive(int input[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i < input.length; i++){
            if(input[i] < min){
                min = input[i];
            }
        }
        for(int i=0; i < input.length; i++){
            if(Math.abs(input[i]) - min >= input.length){
                return false;
            }
            if(input[Math.abs(input[i]) - min] < 0){
                return false;
            }
            input[Math.abs(input[i]) - min] = -input[Math.abs(input[i]) - min];
            System.out.print(input[i]+" ");
        }
        for(int i=0; i < input.length ; i++){
        	input[i] = Math.abs(input[i]);
            System.out.println(input[i]);
        }
        return true;
    }
    
    public static void main(String args[]){
        int input[] = {72,74,75,76,77,78};
        AelementsinConsecutive cia = new AelementsinConsecutive();
        System.out.println(cia.areConsecutive(input));
    }

}
