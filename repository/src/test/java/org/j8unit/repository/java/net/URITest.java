package org.j8unit.repository.java.net;

import java.net.URI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URITest
implements org.j8unit.repository.java.net.URITests<URI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URI]

    @Override
    public URI createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.URI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URI]

}
