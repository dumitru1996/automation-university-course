package lesson3.basics_of_programming;

public enum DayOfWeekEnum {

    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURDSY(4), FRIDAY(5),
    SATURDAY(6), SUNDAY(7);

    private final int dayOfWeek;

    DayOfWeekEnum(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public static DayOfWeekEnum findByNumber(int dayNumber){
        for( DayOfWeekEnum value : values()){
            if (dayNumber == value.getDayOfWeek()){
                return value;
            }
        }
        return null;
    }
}
