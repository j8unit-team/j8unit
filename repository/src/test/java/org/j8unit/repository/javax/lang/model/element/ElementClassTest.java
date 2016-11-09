package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.Element;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Element} (by simply reusing the J8Unit
 * test interface {@link ElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class ElementClassTest
implements ElementClassTests<Element> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.Element]

    @Override
    public Class<Element> createNewSUT() {
        return Element.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.Element]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.Element]

}
