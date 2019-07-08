package com.example.demo.enums;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum WeekEnum {

    /** 星期一 */
    MONDAY( 1, "星期一"),

    /** 星期二 */
    THUSDAY(2, "星期二"),

    /** 星期三 */
    WEDNESDAY(3, "星期三");

    private int dayId;
    private String dayName;

    WeekEnum(int dayId, String dayName) {
        this.dayId = dayId;
        this.dayName = dayName;

    }

    public static WeekEnum getWeekEnumDayNameFromDayId(int dayId) {
        WeekEnum[] enums = values();
        for ( WeekEnum e: enums ) {
            if (e.getDayId() == dayId) {
                return e;
            }
        }
        return null;
    }
}
