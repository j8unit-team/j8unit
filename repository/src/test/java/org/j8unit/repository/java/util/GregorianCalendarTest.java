package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GregorianCalendarTest
implements org.j8unit.repository.java.util.GregorianCalendarTests<java.util.GregorianCalendar> {

    @Override
    public java.util.GregorianCalendar createNewSUT() {
        return new java.util.GregorianCalendar();
    }

}
