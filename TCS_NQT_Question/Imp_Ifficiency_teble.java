package TCS_NQT_Question;

import java.util.Scanner;

public class Imp_Ifficiency_teble {

    /// founction for the miminum Eficiency...
    public static int minEfficiency_table(int n,int salery[],int k){
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(salery[i]==salery[j]){
                    temp[j]=salery[j];
                }
            }
        }
        int minE=Integer.MAX_VALUE;
        int people=0;
        for(int i=0;i<n;i++){
            int table=i+1;
            people=0;
            for(int j=n-1;j>=0;j--){
                if(temp[j]!=0){
                    if()
                }
            }
        }
        

        return 0;
    }
    
    
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no. of enployee ");
        int n = sc.nextInt();
        int salery[] = new int[n];
        System.out.println("enter ther salery ..");
        for (int i = 0; i < salery.length; i++) {
            System.out.println("enter employee " + (i + 1) + " salery ");
            salery[i] = sc.nextInt();
        }
        System.out.println("enter table cost ");
        int k = sc.nextInt();
        minEfficiency_table(n, salery, k);

    }
}
/*
Mike has arranged a small party for the inauguration of his new startup. He has invited all of his fellow employees who are N in number. These employees are indexed with an array starting from 1 to N. In this startup, everyone knows each other’s salary. We will represent salary by an integer value. Mike has to arrange tables, where he will accommodate everyone. But he is a little thrifty in that, he wants to adjust everyone in as few tables as he can. Tables of various seating are available. Let’s say the cost of renting each table is K. All the employees have to seat in the order of the index. The only problem is that the employees with the same salary can get into arguments which can ruin the party.
Mike came across the term inefficiency of arrangement, which can be defined as the sum of the cost of tables + the total number of people getting into arguments. Given the number of employees, N, and their salaries in array a[ ], he wants to find the optimal inefficiency, i.e., the smallest possible value for the inefficiency of arranging the N employees.

Let’s understand it with an example.
Number of employees invited N = 5
A a = {5 1 3 3 3}
K = 1

Now let’s check all the combinations and how in-efficient is all of them.

When we make 1st, 2nd, and 3rd employee on table-1 and 4th and 5th on table-2
Cost of 2 tables = 2*1
Number of people getting into arguments = 2 (two 3’s: 4th and 5th employee)
Total = 2 + 2 = 4

When we make 1st, 2nd, 3rd, and 4th employees on table-1 and 5th on table-2
Cost of 2 tables = 2*1
Number of people getting into arguments = 2 (two 3’s: 4th and 5th employee)
Total = 2 + 2 = 4

When we make all of them sit at 1 table, then inefficiency will be
Cost of 1 table = 1
Number of people getting into arguments = 3 (all 3’s: 3rd, 4th and 5th employee)
Total = 1 + 3 = 4

When we make 1st, 2nd and 3rd employee on table-1 and 4th on table-2 and 5th on table-3
Cost of 3 tables = 3*1
Number of people getting into arguments = 0 (all 3’s are. sitting at different tables)
Total = 3 + 0 = 3

Hence the optimal in-efficiency is 3.
So, the output will be 3.


 */
