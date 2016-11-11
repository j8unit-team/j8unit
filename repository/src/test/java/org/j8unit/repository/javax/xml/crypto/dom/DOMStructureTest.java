package org.j8unit.repository.javax.xml.crypto.dom;

import javax.xml.crypto.dom.DOMStructure;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DOMStructure} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dom.DOMStructureTests}).
 */

@RunWith(J8Unit4.class)
public class DOMStructureTest
implements DOMStructureTests<DOMStructure> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dom.DOMStructure]

    @Override
    public DOMStructure createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.crypto.dom.DOMStructure], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dom.DOMStructure]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dom.DOMStructure]

}
