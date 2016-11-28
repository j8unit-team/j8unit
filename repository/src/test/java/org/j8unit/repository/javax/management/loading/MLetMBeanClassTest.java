package org.j8unit.repository.javax.management.loading;

import javax.management.loading.MLetMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MLetMBean} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.management.loading.MLetMBeanClassTests}).
 */
@RunWith(J8Unit4.class)
public class MLetMBeanClassTest
implements MLetMBeanClassTests<MLetMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.loading.MLetMBean]

    @Override
    public Class<MLetMBean> createNewSUT() {
        return MLetMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.loading.MLetMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.loading.MLetMBean]

}
