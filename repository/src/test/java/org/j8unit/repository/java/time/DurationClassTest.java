package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DurationClassTest
implements org.j8unit.repository.java.time.DurationClassTests<java.time.Duration> {

    @Override
    public Class<java.time.Duration> createNewSUT() {
        return java.time.Duration.class;
    }

}
