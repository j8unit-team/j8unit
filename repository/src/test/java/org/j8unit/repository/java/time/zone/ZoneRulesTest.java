package org.j8unit.repository.java.time.zone;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneRulesTest
implements org.j8unit.repository.java.time.zone.ZoneRulesTests<java.time.zone.ZoneRules> {

    @Override
    public java.time.zone.ZoneRules createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.zone.ZoneRules] available.");
    }

}
