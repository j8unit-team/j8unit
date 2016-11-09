package org.j8unit.repository.java.time.zone;

import java.time.zone.ZoneOffsetTransition;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ZoneOffsetTransition} (by simply
 * reusing the J8Unit test interface {@link ZoneOffsetTransitionTests}).
 */

@RunWith(J8Unit4.class)
public class ZoneOffsetTransitionTest
implements ZoneOffsetTransitionTests<ZoneOffsetTransition> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.zone.ZoneOffsetTransition]

    @Override
    public ZoneOffsetTransition createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.zone.ZoneOffsetTransition], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.zone.ZoneOffsetTransition]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.zone.ZoneOffsetTransition]

}
