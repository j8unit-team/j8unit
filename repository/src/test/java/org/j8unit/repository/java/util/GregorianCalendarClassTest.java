package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GregorianCalendarClassTest
implements org.j8unit.repository.java.util.GregorianCalendarClassTests<java.util.GregorianCalendar> {

    @Override
    public Class<java.util.GregorianCalendar> createNewSUT() {
        return java.util.GregorianCalendar.class;
    }

}
