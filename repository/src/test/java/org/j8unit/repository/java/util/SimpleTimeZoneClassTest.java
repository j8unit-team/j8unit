package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleTimeZoneClassTest
implements org.j8unit.repository.java.util.SimpleTimeZoneClassTests<java.util.SimpleTimeZone> {

    @Override
    public Class<java.util.SimpleTimeZone> createNewSUT() {
        return java.util.SimpleTimeZone.class;
    }

}
