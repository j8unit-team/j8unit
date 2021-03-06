package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.Attribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Attribute} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.stream.events.AttributeClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributeClassTest
implements org.j8unit.repository.javax.xml.stream.events.AttributeClassTests<Attribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.Attribute]

    @Override
    public Class<Attribute> createNewSUT() {
        return Attribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.Attribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.Attribute]

}
