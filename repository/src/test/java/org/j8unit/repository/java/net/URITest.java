package org.j8unit.repository.java.net;

import java.net.URI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link URI} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.net.URITests}).
 */
@RunWith(J8Unit4.class)
public class URITest
implements URITests<URI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URI]

    @Override
    public URI createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.URI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.URI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.URI]

}
