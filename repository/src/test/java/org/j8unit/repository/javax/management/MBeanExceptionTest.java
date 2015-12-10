package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanExceptionTest
implements org.j8unit.repository.javax.management.MBeanExceptionTests<javax.management.MBeanException> {

    @Override
    public javax.management.MBeanException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.MBeanException] available.");
    }

}
