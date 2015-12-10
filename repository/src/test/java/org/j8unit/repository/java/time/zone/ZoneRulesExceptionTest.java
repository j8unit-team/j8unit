package org.j8unit.repository.java.time.zone;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneRulesExceptionTest
implements org.j8unit.repository.java.time.zone.ZoneRulesExceptionTests<java.time.zone.ZoneRulesException> {

    @Override
    public java.time.zone.ZoneRulesException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.zone.ZoneRulesException] available.");
    }

}
