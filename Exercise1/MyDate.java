
package Exercise1;

public class MyDate {
    private int day;
    private String month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    

    @Override
    public String toString() {
        return day + "\t" + month + "\t" + year;
    }
    
}
