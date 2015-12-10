package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocalTimeClassTest
implements org.j8unit.repository.java.time.LocalTimeClassTests<java.time.LocalTime> {

    @Override
    public Class<java.time.LocalTime> createNewSUT() {
        return java.time.LocalTime.class;
    }

}
