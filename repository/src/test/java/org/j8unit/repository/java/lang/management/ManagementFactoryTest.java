package org.j8unit.repository.java.lang.management;

import java.lang.management.ManagementFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ManagementFactoryTest
implements org.j8unit.repository.java.lang.management.ManagementFactoryTests<ManagementFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.ManagementFactory]

    @Override
    public ManagementFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.management.ManagementFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.management.ManagementFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.management.ManagementFactory]

}
