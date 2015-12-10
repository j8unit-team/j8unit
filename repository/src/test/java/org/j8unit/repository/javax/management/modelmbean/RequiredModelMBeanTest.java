package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RequiredModelMBeanTest
implements org.j8unit.repository.javax.management.modelmbean.RequiredModelMBeanTests<javax.management.modelmbean.RequiredModelMBean> {

    @Override
    public javax.management.modelmbean.RequiredModelMBean createNewSUT() {
        try {
            return new javax.management.modelmbean.RequiredModelMBean();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
