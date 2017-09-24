import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int length = inputArray.length;
        int[] numberArray = new int[length];
        for (int i = 0; i < length; i++) {
            numberArray[i] = Integer.parseInt(inputArray[i]);
        }
        //
        int[] modNumberArray = new int[length];
        for (int i = 0; i < length; i++) {
            modNumberArray[i] = numberArray[i] % 1000;

        }
        // insert sort
        for( int i=0; i<length-1; i++ ) {
            for( int j=i+1; j>0; j-- ) {
                if( modNumberArray[j-1] <= modNumberArray[j] )
                    break;
                int temp = modNumberArray[j];
                modNumberArray[j] = modNumberArray[j-1];
                modNumberArray[j-1] = temp;

                int temp1 = numberArray[j];
                numberArray[j] = numberArray[j-1];
                numberArray[j-1] = temp1;
            }
        }
        int n = sc.nextInt();
        System.out.print(numberArray[n]);
    }
}
