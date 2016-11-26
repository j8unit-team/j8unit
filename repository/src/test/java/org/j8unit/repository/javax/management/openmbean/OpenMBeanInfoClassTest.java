package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenMBeanInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class OpenMBeanInfoClassTest
implements OpenMBeanInfoClassTests<OpenMBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.OpenMBeanInfo]

    @Override
    public Class<OpenMBeanInfo> createNewSUT() {
        return OpenMBeanInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.OpenMBeanInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.OpenMBeanInfo]

}
