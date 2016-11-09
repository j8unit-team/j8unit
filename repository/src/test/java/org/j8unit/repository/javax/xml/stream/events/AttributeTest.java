package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.Attribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Attribute} (by simply reusing the
 * J8Unit test interface {@link AttributeTests}).
 */

@RunWith(J8Unit4.class)
public class AttributeTest
implements AttributeTests<Attribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.events.Attribute]

    @Override
    public Attribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.events.Attribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.events.Attribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.events.Attribute]

}
