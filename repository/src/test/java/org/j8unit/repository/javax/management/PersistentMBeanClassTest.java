package org.j8unit.repository.javax.management;

import javax.management.PersistentMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PersistentMBean} (by simply reusing the
 * J8Unit test interface {@link PersistentMBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class PersistentMBeanClassTest
implements PersistentMBeanClassTests<PersistentMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.PersistentMBean]

    @Override
    public Class<PersistentMBean> createNewSUT() {
        return PersistentMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.PersistentMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.PersistentMBean]

}
