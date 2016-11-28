package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ModelMBeanInfo} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanInfoTests}).
 */
@RunWith(J8Unit4.class)
public class ModelMBeanInfoTest
implements ModelMBeanInfoTests<ModelMBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanInfo]

    @Override
    public ModelMBeanInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.modelmbean.ModelMBeanInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanInfo]

}
