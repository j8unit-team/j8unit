package org.j8unit.repository.javax.xml.transform.dom;

import javax.xml.transform.dom.DOMLocator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMLocator} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.transform.dom.DOMLocatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class DOMLocatorClassTest
implements DOMLocatorClassTests<DOMLocator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.dom.DOMLocator]

    @Override
    public Class<DOMLocator> createNewSUT() {
        return DOMLocator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.dom.DOMLocator]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.dom.DOMLocator]

}
