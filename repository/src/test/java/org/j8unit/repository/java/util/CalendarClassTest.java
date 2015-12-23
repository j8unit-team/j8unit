package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CalendarClassTest
implements org.j8unit.repository.java.util.CalendarClassTests<java.util.Calendar> {

    @Override
    public Class<java.util.Calendar> createNewSUT() {
        return java.util.Calendar.class;
    }

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.util.CalendarClassTests.BuilderClassTests<java.util.Calendar.Builder> {

        @Override
        public Class<java.util.Calendar.Builder> createNewSUT() {
            return java.util.Calendar.Builder.class;
        }

    }

}
