package org.j8unit.repository.java.lang.management;

import java.lang.management.ClassLoadingMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClassLoadingMXBean} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.management.ClassLoadingMXBeanClassTests}).
 */
@RunWith(J8Unit4.class)
public class ClassLoadingMXBeanClassTest
implements ClassLoadingMXBeanClassTests<ClassLoadingMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.ClassLoadingMXBean]

    @Override
    public Class<ClassLoadingMXBean> createNewSUT() {
        return ClassLoadingMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.ClassLoadingMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.ClassLoadingMXBean]

}
