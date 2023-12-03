/*
 * Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 

So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

 Example 1:

Input 

mon-> input String denoting the start of the month.

13  -> input integer denoting the number of days from the start of the month.
output is 2;
 */
package TCS_NQT_Question;
public class FindSunday {
    public static void findSunday(String startDay,int day){
        if(day>31){
            return;
        }
        String days[]={"Mon","Tues","wednes","Thrus","Fri","suter","sun"};
        int daycout=0;
        int sun=0;
        for (int i = 0; i < days.length; i++) {
            if(days[i].equalsIgnoreCase(startDay)){
                daycout=i+1;
            }
            
        }
        daycout=7-daycout;
        //sun++;
        for(int i=daycout;i<=day;i+=7 ){
            sun++;
        }
        System.out.println("no. of sunday "+sun);
    }
    
            
    public static void main(String args[]) {
        // TODO code application logic here
        findSunday("sun", 13);
    }
}
