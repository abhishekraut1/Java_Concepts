package com.company;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}
// Driver class that contains an object of "day" and
// main().
class Test {
    Day day; //Object of enum Day

    // Constructor
    public void Check(Day day) {
        this.day = day;
    }
    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day)
        {
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case WEDNESDAY:
                System.out.println("Fridays are better.");
                break;
            case TUESDAY:
                System.out.println("Fridays are better.");
                break;
            case THURSDAY:
                System.out.println("Fridays are better.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
                System.out.println("Fridays are better.");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
    // Driver method
    public static void main(String[] args)
    {
        String str = "MONDAY";
        Test t = new Test();
        t.Check(Day.MONDAY);
        t.dayIsLike();

        t.Check(Day.TUESDAY);
        t.dayIsLike();

        t.Check(Day.WEDNESDAY);
        t.dayIsLike();

        t.Check(Day.THURSDAY);
        t.dayIsLike();

        t.Check(Day.FRIDAY);
        t.dayIsLike();
        t.Check(Day.SATURDAY);
        t.dayIsLike();

        t.Check(Day.SUNDAY);
        t.dayIsLike();
    }
}
