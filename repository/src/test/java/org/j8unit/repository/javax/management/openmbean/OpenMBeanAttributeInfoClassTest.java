package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanAttributeInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenMBeanAttributeInfo} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanAttributeInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class OpenMBeanAttributeInfoClassTest
implements OpenMBeanAttributeInfoClassTests<OpenMBeanAttributeInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.OpenMBeanAttributeInfo]

    @Override
    public Class<OpenMBeanAttributeInfo> createNewSUT() {
        return OpenMBeanAttributeInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.OpenMBeanAttributeInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.OpenMBeanAttributeInfo]

}
