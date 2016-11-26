package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBeanAttributeInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ModelMBeanAttributeInfo} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanAttributeInfoTests}).
 */
@RunWith(J8Unit4.class)
public class ModelMBeanAttributeInfoTest
implements ModelMBeanAttributeInfoTests<ModelMBeanAttributeInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanAttributeInfo]

    @Override
    public ModelMBeanAttributeInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.modelmbean.ModelMBeanAttributeInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanAttributeInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanAttributeInfo]

}
