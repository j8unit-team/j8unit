package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeMBeanExceptionClassTest
implements org.j8unit.repository.javax.management.RuntimeMBeanExceptionClassTests<javax.management.RuntimeMBeanException> {

    @Override
    public Class<javax.management.RuntimeMBeanException> createNewSUT() {
        return javax.management.RuntimeMBeanException.class;
    }

}
