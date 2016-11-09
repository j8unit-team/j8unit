package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.XMLStructure;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLStructure} (by simply reusing the
 * J8Unit test interface {@link XMLStructureClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLStructureClassTest
implements XMLStructureClassTests<XMLStructure> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.XMLStructure]

    @Override
    public Class<XMLStructure> createNewSUT() {
        return XMLStructure.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.XMLStructure]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.XMLStructure]

}
