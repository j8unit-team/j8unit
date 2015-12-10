package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanExceptionClassTest
implements org.j8unit.repository.javax.management.MBeanExceptionClassTests<javax.management.MBeanException> {

    @Override
    public Class<javax.management.MBeanException> createNewSUT() {
        return javax.management.MBeanException.class;
    }

}
