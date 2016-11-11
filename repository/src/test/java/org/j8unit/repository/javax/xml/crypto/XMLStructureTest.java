package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.XMLStructure;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLStructure} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.XMLStructureTests}).
 */

@RunWith(J8Unit4.class)
public class XMLStructureTest
implements XMLStructureTests<XMLStructure> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.XMLStructure]

    @Override
    public XMLStructure createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.XMLStructure], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.XMLStructure]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.XMLStructure]

}
