package org.j8unit.repository.java.beans;

import java.beans.BeanDescriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanDescriptorTest
implements org.j8unit.repository.java.beans.BeanDescriptorTests<BeanDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.BeanDescriptor]

    @Override
    public BeanDescriptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.BeanDescriptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.BeanDescriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.BeanDescriptor]

}
