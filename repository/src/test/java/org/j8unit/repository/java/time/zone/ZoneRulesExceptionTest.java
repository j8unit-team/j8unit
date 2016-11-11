package org.j8unit.repository.java.time.zone;

import java.time.zone.ZoneRulesException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ZoneRulesException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.time.zone.ZoneRulesExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class ZoneRulesExceptionTest
implements ZoneRulesExceptionTests<ZoneRulesException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.zone.ZoneRulesException]

    @Override
    public ZoneRulesException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.zone.ZoneRulesException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.zone.ZoneRulesException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.zone.ZoneRulesException]

}
