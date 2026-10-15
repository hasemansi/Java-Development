// Leap Year Checker — Intermediate
// Write a program to determine whether a given year is a leap year. Consider the rules for years divisible by 4, 100, and 400.
public class LeapYear {
    void main()
    {
        int year = 2024;

        if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0))
        {
            IO.println(year +" is a leap year");
        }
        else
        {
            IO.println(year+" is not a leap year");
        } 
    }
}
