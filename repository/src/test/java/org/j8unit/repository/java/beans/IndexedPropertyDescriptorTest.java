package org.j8unit.repository.java.beans;

import java.beans.IndexedPropertyDescriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IndexedPropertyDescriptor} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.beans.IndexedPropertyDescriptorTests}).
 */
@RunWith(J8Unit4.class)
public class IndexedPropertyDescriptorTest
implements IndexedPropertyDescriptorTests<IndexedPropertyDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.IndexedPropertyDescriptor]

    @Override
    public IndexedPropertyDescriptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.IndexedPropertyDescriptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.IndexedPropertyDescriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.IndexedPropertyDescriptor]

}
