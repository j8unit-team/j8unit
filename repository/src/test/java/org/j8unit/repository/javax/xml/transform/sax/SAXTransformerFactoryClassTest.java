package org.j8unit.repository.javax.xml.transform.sax;

import javax.xml.transform.sax.SAXTransformerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SAXTransformerFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.sax.SAXTransformerFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class SAXTransformerFactoryClassTest
implements SAXTransformerFactoryClassTests<SAXTransformerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.sax.SAXTransformerFactory]

    @Override
    public Class<SAXTransformerFactory> createNewSUT() {
        return SAXTransformerFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.sax.SAXTransformerFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.sax.SAXTransformerFactory]

}
