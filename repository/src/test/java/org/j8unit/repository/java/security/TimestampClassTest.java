package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimestampClassTest
implements org.j8unit.repository.java.security.TimestampClassTests<java.security.Timestamp> {

    @Override
    public Class<java.security.Timestamp> createNewSUT() {
        return java.security.Timestamp.class;
    }

}
