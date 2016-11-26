package org.j8unit.repository.javax.management;

import javax.management.PersistentMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PersistentMBean} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.PersistentMBeanTests}).
 */
@RunWith(J8Unit4.class)
public class PersistentMBeanTest
implements PersistentMBeanTests<PersistentMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.PersistentMBean]

    @Override
    public PersistentMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.PersistentMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.PersistentMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.PersistentMBean]

}
