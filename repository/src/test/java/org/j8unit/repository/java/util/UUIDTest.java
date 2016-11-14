package org.j8unit.repository.java.util;

import java.util.UUID;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UUID} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.UUIDTests}).
 */

@RunWith(J8Unit4.class)
public class UUIDTest
implements UUIDTests<UUID> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.UUID]

    @Override
    public UUID createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.UUID], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.UUID]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.UUID]

}
