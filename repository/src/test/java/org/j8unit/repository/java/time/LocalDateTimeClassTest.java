package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocalDateTimeClassTest
implements org.j8unit.repository.java.time.LocalDateTimeClassTests<java.time.LocalDateTime> {

    @Override
    public Class<java.time.LocalDateTime> createNewSUT() {
        return java.time.LocalDateTime.class;
    }

}
