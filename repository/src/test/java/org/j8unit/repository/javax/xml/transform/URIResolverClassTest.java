package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.URIResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URIResolver} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.URIResolverClassTests}).
 */
@RunWith(J8Unit4.class)
public class URIResolverClassTest
implements URIResolverClassTests<URIResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.URIResolver]

    @Override
    public Class<URIResolver> createNewSUT() {
        return URIResolver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.URIResolver]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.URIResolver]

}
