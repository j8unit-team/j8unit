package org.j8unit.repository.java.time.zone;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneRulesExceptionClassTest
implements org.j8unit.repository.java.time.zone.ZoneRulesExceptionClassTests<java.time.zone.ZoneRulesException> {

    @Override
    public Class<java.time.zone.ZoneRulesException> createNewSUT() {
        return java.time.zone.ZoneRulesException.class;
    }

}
