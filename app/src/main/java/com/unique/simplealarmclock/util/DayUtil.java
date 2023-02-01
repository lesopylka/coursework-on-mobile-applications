package com.unique.simplealarmclock.util;

import java.util.Calendar;

public final class DayUtil {
    public static final String toDay(int day) throws Exception {
        switch (day) {
            case Calendar.MONDAY:
                return "Понедельник";
            case Calendar.TUESDAY:
                return "Вторник";
            case Calendar.WEDNESDAY:
                return "Среда";
            case Calendar.THURSDAY:
                return "Четверг";
            case Calendar.FRIDAY:
                return "Пятница";
            case Calendar.SATURDAY:
                return "Суббота";
            case Calendar.SUNDAY:
                return "Воскресенье";
        }
        throw new Exception("Что-то пошло не так");
    }

    public static String getDay(int hour,int minute){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        // if alarm time has already passed
        if (calendar.getTimeInMillis() <= System.currentTimeMillis()) {
            return "Завтра";
        }
        else{
            return "Сегодня";
        }
    }
}
