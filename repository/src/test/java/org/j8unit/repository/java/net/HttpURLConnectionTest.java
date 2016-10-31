package org.j8unit.repository.java.net;

import java.net.HttpURLConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpURLConnectionTest
implements org.j8unit.repository.java.net.HttpURLConnectionTests<HttpURLConnection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.HttpURLConnection]

    @Override
    public HttpURLConnection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.HttpURLConnection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.HttpURLConnection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.HttpURLConnection]

}
