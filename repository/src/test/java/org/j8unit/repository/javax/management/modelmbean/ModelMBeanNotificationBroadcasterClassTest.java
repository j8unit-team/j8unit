package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ModelMBeanNotificationBroadcaster} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanNotificationBroadcasterClassTests}).
 */

@RunWith(J8Unit4.class)
public class ModelMBeanNotificationBroadcasterClassTest
implements ModelMBeanNotificationBroadcasterClassTests<ModelMBeanNotificationBroadcaster> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.modelmbean.ModelMBeanNotificationBroadcaster]

    @Override
    public Class<ModelMBeanNotificationBroadcaster> createNewSUT() {
        return ModelMBeanNotificationBroadcaster.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.modelmbean.ModelMBeanNotificationBroadcaster]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.modelmbean.ModelMBeanNotificationBroadcaster]

}
