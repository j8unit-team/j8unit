package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OffsetDateTimeClassTest
implements org.j8unit.repository.java.time.OffsetDateTimeClassTests<java.time.OffsetDateTime> {

    @Override
    public Class<java.time.OffsetDateTime> createNewSUT() {
        return java.time.OffsetDateTime.class;
    }

}
