package org.j8unit.repository.java.lang.management;

import java.lang.management.RuntimeMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeMXBeanClassTest
implements org.j8unit.repository.java.lang.management.RuntimeMXBeanClassTests<RuntimeMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.RuntimeMXBean]

    @Override
    public Class<RuntimeMXBean> createNewSUT() {
        return RuntimeMXBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.RuntimeMXBean]

}
