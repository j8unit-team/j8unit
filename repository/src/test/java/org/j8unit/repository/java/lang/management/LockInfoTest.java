package org.j8unit.repository.java.lang.management;

import java.lang.management.LockInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LockInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.management.LockInfoTests}).
 */
@RunWith(J8Unit4.class)
public class LockInfoTest
implements LockInfoTests<LockInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.LockInfo]

    @Override
    public LockInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.management.LockInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.management.LockInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.management.LockInfo]

}
