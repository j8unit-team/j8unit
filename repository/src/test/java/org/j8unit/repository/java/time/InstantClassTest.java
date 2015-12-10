package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstantClassTest
implements org.j8unit.repository.java.time.InstantClassTests<java.time.Instant> {

    @Override
    public Class<java.time.Instant> createNewSUT() {
        return java.time.Instant.class;
    }

}
