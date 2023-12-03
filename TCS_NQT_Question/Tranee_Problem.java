/*
 * Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.

Display the most fit trainee (or trainees) and the highest average oxygen level.

Note:
95
92
95
92
90
92
90
92
90

The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.
Average Oxygen Values should be rounded.
 */
package TCS_NQT_Question;

import java.util.Scanner;

public class Tranee_Problem {

    public static void main(String args[]) {
        // TODO code application logic here
        int train[][] = new int[3][3];
        System.out.println("enter heart beat");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < train.length; i++) {
            for (int j = 0; j < train.length; j++) {
                train[i][j] = sc.nextInt();
                if (train[i][j] < 1 || train[i][j] > 100) {
                    train[i][j] = 0;

                }
            }
        }
        int avg[]=new int[3];
        int max=0;
        for(int i=0;i<train.length;i++){
            for(int j=0;j<train.length;j++){
                avg[i] += train[j][i];
                       
            }
            avg[i]/=3;
            if(max<avg[i]){
                max=avg[i];
            }
        }
        for(int i=0;i<avg.length;i++){
            if(avg[i]==max){
                System.out.println("trainee "+(i+1));
            }
            if(avg[i]<70){
                System.out.println("all trainee unfit");
                return;
            }
        }
    }
}
