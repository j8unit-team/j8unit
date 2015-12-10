package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeZoneClassTest
implements org.j8unit.repository.java.util.TimeZoneClassTests<java.util.TimeZone> {

    @Override
    public Class<java.util.TimeZone> createNewSUT() {
        return java.util.TimeZone.class;
    }

}
