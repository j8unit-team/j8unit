package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLResolver} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.XMLResolverClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLResolverClassTest
implements XMLResolverClassTests<XMLResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.XMLResolver]

    @Override
    public Class<XMLResolver> createNewSUT() {
        return XMLResolver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.XMLResolver]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.XMLResolver]

}
