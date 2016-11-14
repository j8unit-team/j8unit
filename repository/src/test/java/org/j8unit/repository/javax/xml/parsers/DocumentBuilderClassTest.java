package org.j8unit.repository.javax.xml.parsers;

import javax.xml.parsers.DocumentBuilder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentBuilder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.parsers.DocumentBuilderClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentBuilderClassTest
implements DocumentBuilderClassTests<DocumentBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.parsers.DocumentBuilder]

    @Override
    public Class<DocumentBuilder> createNewSUT() {
        return DocumentBuilder.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.parsers.DocumentBuilder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.parsers.DocumentBuilder]

}
