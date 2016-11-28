package org.j8unit.repository.javax.xml.crypto.dom;

import javax.xml.crypto.dom.DOMURIReference;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DOMURIReference} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dom.DOMURIReferenceTests}).
 */
@RunWith(J8Unit4.class)
public class DOMURIReferenceTest
implements DOMURIReferenceTests<DOMURIReference> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dom.DOMURIReference]

    @Override
    public DOMURIReference createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dom.DOMURIReference], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dom.DOMURIReference]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dom.DOMURIReference]

}
