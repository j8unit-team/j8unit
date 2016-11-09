package org.j8unit.repository.javax.management;

import javax.management.MXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MXBean} (by simply reusing the J8Unit
 * test interface {@link MXBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class MXBeanClassTest
implements MXBeanClassTests<MXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MXBean]

    @Override
    public Class<MXBean> createNewSUT() {
        return MXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MXBean]

}
