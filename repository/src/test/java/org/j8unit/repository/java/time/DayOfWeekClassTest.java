package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DayOfWeekClassTest
implements org.j8unit.repository.java.time.DayOfWeekClassTests<java.time.DayOfWeek> {

    @Override
    public Class<java.time.DayOfWeek> createNewSUT() {
        return java.time.DayOfWeek.class;
    }

}
