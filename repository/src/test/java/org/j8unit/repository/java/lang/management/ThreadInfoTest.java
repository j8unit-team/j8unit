package org.j8unit.repository.java.lang.management;

import java.lang.management.ThreadInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadInfoTest
implements org.j8unit.repository.java.lang.management.ThreadInfoTests<ThreadInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.ThreadInfo]

    @Override
    public ThreadInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.management.ThreadInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.ThreadInfo]

}
