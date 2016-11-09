package org.j8unit.repository.java.lang.management;

import java.lang.management.CompilationMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompilationMXBean} (by simply reusing the
 * J8Unit test interface {@link CompilationMXBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class CompilationMXBeanClassTest
implements CompilationMXBeanClassTests<CompilationMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.CompilationMXBean]

    @Override
    public Class<CompilationMXBean> createNewSUT() {
        return CompilationMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.CompilationMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.CompilationMXBean]

}
