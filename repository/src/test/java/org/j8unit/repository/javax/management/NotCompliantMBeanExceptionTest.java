package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotCompliantMBeanExceptionTest
implements org.j8unit.repository.javax.management.NotCompliantMBeanExceptionTests<javax.management.NotCompliantMBeanException> {

    @Override
    public javax.management.NotCompliantMBeanException createNewSUT() {
        return new javax.management.NotCompliantMBeanException();
    }

}
