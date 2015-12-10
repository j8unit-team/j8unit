package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateTest
implements org.j8unit.repository.java.util.DateTests<java.util.Date> {

    @Override
    public java.util.Date createNewSUT() {
        return new java.util.Date();
    }

}
