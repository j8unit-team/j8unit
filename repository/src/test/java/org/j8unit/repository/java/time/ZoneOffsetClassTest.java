package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneOffsetClassTest
implements org.j8unit.repository.java.time.ZoneOffsetClassTests<java.time.ZoneOffset> {

    @Override
    public Class<java.time.ZoneOffset> createNewSUT() {
        return java.time.ZoneOffset.class;
    }

}
