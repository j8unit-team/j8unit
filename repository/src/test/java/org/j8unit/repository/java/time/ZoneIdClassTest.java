package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneIdClassTest
implements org.j8unit.repository.java.time.ZoneIdClassTests<java.time.ZoneId> {

    @Override
    public Class<java.time.ZoneId> createNewSUT() {
        return java.time.ZoneId.class;
    }

}
