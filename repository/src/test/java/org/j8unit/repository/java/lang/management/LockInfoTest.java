package org.j8unit.repository.java.lang.management;

import java.lang.management.LockInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LockInfoTest
implements org.j8unit.repository.java.lang.management.LockInfoTests<LockInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.LockInfo]

    @Override
    public LockInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.management.LockInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.LockInfo]

}
