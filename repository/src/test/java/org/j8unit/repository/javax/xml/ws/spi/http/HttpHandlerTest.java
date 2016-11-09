package org.j8unit.repository.javax.xml.ws.spi.http;

import javax.xml.ws.spi.http.HttpHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HttpHandler} (by simply reusing the
 * J8Unit test interface {@link HttpHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class HttpHandlerTest
implements HttpHandlerTests<HttpHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.spi.http.HttpHandler]

    @Override
    public HttpHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.spi.http.HttpHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.spi.http.HttpHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.spi.http.HttpHandler]

}
