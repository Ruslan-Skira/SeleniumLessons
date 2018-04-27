package lesson7.HW;

public class Date {
    private int day = 1;
    private int month = 1;
    private int year = 1970;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date date) { // copy constructor
        day = date.getDay();
        month = date.getMonth();
        year = date.getYear();
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void set(int day, int month, int year) {
        if (day > 0 && day <= 31) {
            this.day = day;
        }
        if (month > 0 && month <= 12) {
            this.month = month;
        }
        this.year = year;
    }

    public void set(Date date) {
        day = date.getDay();
        month = date.getMonth();
        year = date.getYear();
    }

    public void nextDay() {
        if (day == 31) {
            nextMonth();
            day = 1;
        } else {
            day++;
        }
    }


    public void nextMonth() {
        if (month == 12) {
            nextYear();
            month = 1;
        } else {
            month++;
        }

    }

    public void nextYear() {
        year++;
    }

    @Override
    public String toString() {
        return "" + (day < 10 ? "0" + day : day) + "." + (month < 10 ? "0" + month : month) + "." + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Date date = (Date) o;

        if (day != date.day) return false;
        if (month != date.month) return false;
        return year == date.year;
    }

    @Override
    public int hashCode() {
        int result = day;
        result = 31 * result + month;
        result = 31 * result + year;
        return result;
    }

    public void printDate() {
        System.out.println(this);
    }
}
