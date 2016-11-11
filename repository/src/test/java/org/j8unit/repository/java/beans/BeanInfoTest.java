package org.j8unit.repository.java.beans;

import java.beans.BeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BeanInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.BeanInfoTests}).
 */

@RunWith(J8Unit4.class)
public class BeanInfoTest
implements BeanInfoTests<BeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.BeanInfo]

    @Override
    public BeanInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.BeanInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.BeanInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.BeanInfo]

}
