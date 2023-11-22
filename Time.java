public class Time {
    int hour;
    int minute;
    int second;
    public Time(int h, int min, int sec)
    {
        this.hour=h;
        this.minute=min;
        this.second=sec;
    }
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    public int getSecond()
    {
        return second;
    }
    public void setHour(int h)
    {
        hour=h;
    }
    public void setMinute(int min)
    {
        minute=min;
    }
    public void setSecond(int sec)
    {
        second=sec;
    }
    public void setTime(int h, int min, int sec)
    {
        hour=h;
        minute=min;
        second=sec;
    }
    public void print()
    {
        System.out.println(hour+":"+minute+":"+second);
    }
    public static void main(String[] args) {
        Time t1=new Time(03,07,04);
        t1.setTime(05,09,02,);
        t1.print();
    }
}