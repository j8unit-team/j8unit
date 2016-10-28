package org.j8unit.repository.java.lang.management;

import java.lang.management.BufferPoolMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferPoolMXBeanClassTest
implements org.j8unit.repository.java.lang.management.BufferPoolMXBeanClassTests<BufferPoolMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.BufferPoolMXBean]

    @Override
    public Class<BufferPoolMXBean> createNewSUT() {
        return BufferPoolMXBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.BufferPoolMXBean]

}
