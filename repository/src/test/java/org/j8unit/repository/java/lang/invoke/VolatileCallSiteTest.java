package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.VolatileCallSite;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VolatileCallSiteTest
implements org.j8unit.repository.java.lang.invoke.VolatileCallSiteTests<VolatileCallSite> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.VolatileCallSite]

    @Override
    public VolatileCallSite createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.invoke.VolatileCallSite], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.VolatileCallSite]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.VolatileCallSite]

}
