package org.j8unit.repository.java.time.zone;

import java.time.zone.ZoneRules;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneRulesTest
implements org.j8unit.repository.java.time.zone.ZoneRulesTests<ZoneRules> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.zone.ZoneRules]

    @Override
    public ZoneRules createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.zone.ZoneRules], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.zone.ZoneRules]

}
