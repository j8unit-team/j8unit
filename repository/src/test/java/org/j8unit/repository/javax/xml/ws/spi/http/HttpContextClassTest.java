package org.j8unit.repository.javax.xml.ws.spi.http;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpContextClassTest
implements org.j8unit.repository.javax.xml.ws.spi.http.HttpContextClassTests<javax.xml.ws.spi.http.HttpContext> {

    @Override
    public Class<javax.xml.ws.spi.http.HttpContext> createNewSUT() {
        return javax.xml.ws.spi.http.HttpContext.class;
    }

}
