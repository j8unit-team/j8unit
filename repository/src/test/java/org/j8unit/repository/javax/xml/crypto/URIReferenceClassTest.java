package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.URIReference;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URIReference} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.URIReferenceClassTests}).
 */
@RunWith(J8Unit4.class)
public class URIReferenceClassTest
implements URIReferenceClassTests<URIReference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.URIReference]

    @Override
    public Class<URIReference> createNewSUT() {
        return URIReference.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.URIReference]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.URIReference]

}
