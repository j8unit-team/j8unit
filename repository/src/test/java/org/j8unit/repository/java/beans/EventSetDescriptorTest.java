package org.j8unit.repository.java.beans;

import java.beans.EventSetDescriptor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EventSetDescriptor} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.beans.EventSetDescriptorTests}).
 */

@RunWith(J8Unit4.class)
public class EventSetDescriptorTest
implements EventSetDescriptorTests<EventSetDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.EventSetDescriptor]

    @Override
    public EventSetDescriptor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.EventSetDescriptor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.EventSetDescriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.EventSetDescriptor]

}
