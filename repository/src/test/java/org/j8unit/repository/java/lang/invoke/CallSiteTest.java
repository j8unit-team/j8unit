package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.CallSite;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CallSiteTest
implements org.j8unit.repository.java.lang.invoke.CallSiteTests<CallSite> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.CallSite]

    @Override
    public CallSite createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.invoke.CallSite], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.CallSite]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.CallSite]

}
