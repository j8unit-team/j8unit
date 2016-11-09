package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Element;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Element} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.ElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class ElementClassTest
implements org.j8unit.repository.javax.swing.text.ElementClassTests<Element> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Element]

    @Override
    public Class<Element> createNewSUT() {
        return Element.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Element]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Element]

}
