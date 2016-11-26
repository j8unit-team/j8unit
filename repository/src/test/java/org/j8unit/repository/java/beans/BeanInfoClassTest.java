package org.j8unit.repository.java.beans;

import java.beans.BeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BeanInfo} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.beans.BeanInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class BeanInfoClassTest
implements BeanInfoClassTests<BeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.BeanInfo]

    @Override
    public Class<BeanInfo> createNewSUT() {
        return BeanInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.BeanInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.BeanInfo]

}
