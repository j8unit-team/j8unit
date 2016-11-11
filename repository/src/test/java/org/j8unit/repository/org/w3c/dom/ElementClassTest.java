package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Element;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Element} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.ElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class ElementClassTest
implements ElementClassTests<Element> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Element]

    @Override
    public Class<Element> createNewSUT() {
        return Element.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.Element]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Element]

}
