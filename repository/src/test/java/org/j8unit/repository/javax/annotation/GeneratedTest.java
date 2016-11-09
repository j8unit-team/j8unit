package org.j8unit.repository.javax.annotation;

import javax.annotation.Generated;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Generated} (by simply reusing the
 * J8Unit test interface {@link GeneratedTests}).
 */

@RunWith(J8Unit4.class)
public class GeneratedTest
implements GeneratedTests<Generated> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.Generated]

    @Override
    public Generated createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.Generated], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.Generated]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.Generated]

}
