package daysinyear;
public class CountLongMonths {

    public static void main(String args[]) {    
        int[] month_days;       
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;

        int longMonthsCount = 0;
        for(int days: month_days) {
            if (days > 30) {
                longMonthsCount = longMonthsCount + 1;
            }
        }
        System.out.println ("There are " +longMonthsCount+" long months in year.");	
    }
}


