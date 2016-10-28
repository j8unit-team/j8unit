package org.j8unit.repository.java.lang.management;

import java.lang.management.GarbageCollectorMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GarbageCollectorMXBeanClassTest
implements org.j8unit.repository.java.lang.management.GarbageCollectorMXBeanClassTests<GarbageCollectorMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.GarbageCollectorMXBean]

    @Override
    public Class<GarbageCollectorMXBean> createNewSUT() {
        return GarbageCollectorMXBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.GarbageCollectorMXBean]

}
