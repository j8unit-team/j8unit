package org.j8unit.repository.java.lang.management;

import java.lang.management.RuntimeMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RuntimeMXBean} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.management.RuntimeMXBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class RuntimeMXBeanClassTest
implements RuntimeMXBeanClassTests<RuntimeMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.RuntimeMXBean]

    @Override
    public Class<RuntimeMXBean> createNewSUT() {
        return RuntimeMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.RuntimeMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.RuntimeMXBean]

}
