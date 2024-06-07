import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of steps of your staircase");
        int steps = scanner.nextInt();
        if (steps==0){
            System.out.println("__");
            return;
        }
        StringBuilder staircase=new StringBuilder();
        boolean ascendingfromlefttoright = steps>0;

        int numSteps=Math.abs(steps);

        for(int i =0;i<numSteps;i++){
            for (int j =0;j<numSteps-i-1;j++){
                staircase.append(ascendingfromlefttoright ?" ":"_");
            }
            staircase.append("_|");
            staircase.append(System.lineSeparator());
        }
        System.out.println(staircase.toString());
    }
}