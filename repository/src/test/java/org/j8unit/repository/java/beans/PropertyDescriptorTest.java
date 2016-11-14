package org.j8unit.repository.java.beans;

import java.beans.PropertyDescriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyDescriptor} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.beans.PropertyDescriptorTests}).
 */

@RunWith(J8Unit4.class)
public class PropertyDescriptorTest
implements PropertyDescriptorTests<PropertyDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.PropertyDescriptor]

    @Override
    public PropertyDescriptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.PropertyDescriptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.PropertyDescriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.PropertyDescriptor]

}
