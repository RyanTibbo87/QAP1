public class Time {
    // Instance variables
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // All of the "gets"
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    // Setters
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Method to set time
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // toString method to format time as "hours, minute, seconds"
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    // Method to increase time by one second
    public Time nextSecond() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    // Method to decrease time by one second
    public Time previousSecond() {
        this.second--;
        if (this.second == -1) {
            this.second = 59;
            this.minute--;
            if (this.minute == -1) {
                this.minute = 59;
                this.hour--;
                if (this.hour == -1) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }
}
