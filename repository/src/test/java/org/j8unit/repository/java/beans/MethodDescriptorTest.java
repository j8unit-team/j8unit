package org.j8unit.repository.java.beans;

import java.beans.MethodDescriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MethodDescriptorTest
implements org.j8unit.repository.java.beans.MethodDescriptorTests<MethodDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.MethodDescriptor]

    @Override
    public MethodDescriptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.MethodDescriptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.MethodDescriptor]

}
