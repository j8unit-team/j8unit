package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ModelMBeanNotificationBroadcaster}
 * (by simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanNotificationBroadcasterTests}).
 */

@RunWith(J8Unit4.class)
public class ModelMBeanNotificationBroadcasterTest
implements ModelMBeanNotificationBroadcasterTests<ModelMBeanNotificationBroadcaster> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanNotificationBroadcaster]

    @Override
    public ModelMBeanNotificationBroadcaster createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.modelmbean.ModelMBeanNotificationBroadcaster], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanNotificationBroadcaster]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanNotificationBroadcaster]

}
