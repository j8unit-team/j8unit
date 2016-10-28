package org.j8unit.repository.javax.xml.ws.spi.http;

import javax.xml.ws.spi.http.HttpContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpContextTest
implements org.j8unit.repository.javax.xml.ws.spi.http.HttpContextTests<HttpContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.spi.http.HttpContext]

    @Override
    public HttpContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.spi.http.HttpContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.spi.http.HttpContext]

}
