package org.j8unit.repository.javax.xml.crypto.dom;

import javax.xml.crypto.dom.DOMURIReference;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMURIReference} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dom.DOMURIReferenceClassTests}).
 */
@RunWith(J8Unit4.class)
public class DOMURIReferenceClassTest
implements DOMURIReferenceClassTests<DOMURIReference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dom.DOMURIReference]

    @Override
    public Class<DOMURIReference> createNewSUT() {
        return DOMURIReference.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dom.DOMURIReference]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dom.DOMURIReference]

}
