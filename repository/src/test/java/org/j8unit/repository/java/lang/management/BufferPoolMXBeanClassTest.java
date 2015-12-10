package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferPoolMXBeanClassTest
implements org.j8unit.repository.java.lang.management.BufferPoolMXBeanClassTests<java.lang.management.BufferPoolMXBean> {

    @Override
    public Class<java.lang.management.BufferPoolMXBean> createNewSUT() {
        return java.lang.management.BufferPoolMXBean.class;
    }

}
