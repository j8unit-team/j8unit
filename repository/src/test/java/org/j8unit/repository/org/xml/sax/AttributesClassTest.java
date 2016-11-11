package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Attributes} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.xml.sax.AttributesClassTests}).
 */

@RunWith(J8Unit4.class)
public class AttributesClassTest
implements AttributesClassTests<Attributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.Attributes]

    @Override
    public Class<Attributes> createNewSUT() {
        return Attributes.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.Attributes]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.Attributes]

}
