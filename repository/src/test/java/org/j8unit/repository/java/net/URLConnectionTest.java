package org.j8unit.repository.java.net;

import java.net.URLConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLConnectionTest
implements org.j8unit.repository.java.net.URLConnectionTests<URLConnection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URLConnection]

    @Override
    public URLConnection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.URLConnection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URLConnection]

}
