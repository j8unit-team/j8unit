package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanParameterInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenMBeanParameterInfo} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanParameterInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class OpenMBeanParameterInfoClassTest
implements OpenMBeanParameterInfoClassTests<OpenMBeanParameterInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.OpenMBeanParameterInfo]

    @Override
    public Class<OpenMBeanParameterInfo> createNewSUT() {
        return OpenMBeanParameterInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.OpenMBeanParameterInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.OpenMBeanParameterInfo]

}
