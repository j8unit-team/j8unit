package org.j8unit.repository.java.net;

import java.net.URL;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLTest
implements org.j8unit.repository.java.net.URLTests<URL> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URL]

    @Override
    public URL createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.URL], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URL]

}
