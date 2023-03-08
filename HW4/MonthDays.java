package HW4;

/**
 * @author: Silas Rodriguez
 * @date: 3/7/2023
 * @course: CS 2365
 * @assignment: HW4
 * @purpose: This class is used to determine the number of days in a month
 */
public class MonthDays {
    
    private int month;  //1-12 month integer value
    private int year;   //any year

    /*
     * Constructor for MonthDays that sets the month and year 
     */
    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }
    
    /*
     * This method returns the number of days in the month using switch
     */
    public int numberOfDays(){
        switch(month){
            case 1:
                return 31;
            case 2:
                if((year%100==0 && year%400==0) || (year%100!=0 && year % 4 == 0)){
                    return 29;
                }
                else{
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }
    }
}
