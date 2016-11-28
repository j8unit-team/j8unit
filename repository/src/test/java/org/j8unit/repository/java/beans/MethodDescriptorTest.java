package org.j8unit.repository.java.beans;

import java.beans.MethodDescriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MethodDescriptor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.MethodDescriptorTests}).
 */
@RunWith(J8Unit4.class)
public class MethodDescriptorTest
implements MethodDescriptorTests<MethodDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.MethodDescriptor]

    @Override
    public MethodDescriptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.MethodDescriptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.MethodDescriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.MethodDescriptor]

}
