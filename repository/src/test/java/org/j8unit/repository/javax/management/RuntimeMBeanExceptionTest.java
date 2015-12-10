package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeMBeanExceptionTest
implements org.j8unit.repository.javax.management.RuntimeMBeanExceptionTests<javax.management.RuntimeMBeanException> {

    @Override
    public javax.management.RuntimeMBeanException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.RuntimeMBeanException] available.");
    }

}
