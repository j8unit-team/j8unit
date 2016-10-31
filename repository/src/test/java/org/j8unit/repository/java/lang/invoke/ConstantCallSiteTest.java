package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.ConstantCallSite;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConstantCallSiteTest
implements org.j8unit.repository.java.lang.invoke.ConstantCallSiteTests<ConstantCallSite> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.ConstantCallSite]

    @Override
    public ConstantCallSite createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.invoke.ConstantCallSite], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.ConstantCallSite]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.ConstantCallSite]

}
