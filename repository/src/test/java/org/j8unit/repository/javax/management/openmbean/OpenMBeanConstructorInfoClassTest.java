package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanConstructorInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenMBeanConstructorInfo} (by simply
 * reusing the J8Unit test interface {@link OpenMBeanConstructorInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class OpenMBeanConstructorInfoClassTest
implements OpenMBeanConstructorInfoClassTests<OpenMBeanConstructorInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.OpenMBeanConstructorInfo]

    @Override
    public Class<OpenMBeanConstructorInfo> createNewSUT() {
        return OpenMBeanConstructorInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.OpenMBeanConstructorInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.OpenMBeanConstructorInfo]

}
