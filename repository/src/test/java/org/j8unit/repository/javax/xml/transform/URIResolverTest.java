package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.URIResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link URIResolver} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.URIResolverTests}).
 */
@RunWith(J8Unit4.class)
public class URIResolverTest
implements URIResolverTests<URIResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.URIResolver]

    @Override
    public URIResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.transform.URIResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.URIResolver]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.URIResolver]

}
