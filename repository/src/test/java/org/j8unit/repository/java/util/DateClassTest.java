package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateClassTest
implements org.j8unit.repository.java.util.DateClassTests<java.util.Date> {

    @Override
    public Class<java.util.Date> createNewSUT() {
        return java.util.Date.class;
    }

}
