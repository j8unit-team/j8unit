package org.j8unit.repository.javax.management;

import javax.management.MBeanNotificationInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MBeanNotificationInfo} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.management.MBeanNotificationInfoTests}).
 */

@RunWith(J8Unit4.class)
public class MBeanNotificationInfoTest
implements MBeanNotificationInfoTests<MBeanNotificationInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanNotificationInfo]

    @Override
    public MBeanNotificationInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.MBeanNotificationInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.MBeanNotificationInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.MBeanNotificationInfo]

}
