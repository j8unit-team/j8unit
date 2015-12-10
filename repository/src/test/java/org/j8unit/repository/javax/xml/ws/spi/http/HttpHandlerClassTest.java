package org.j8unit.repository.javax.xml.ws.spi.http;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpHandlerClassTest
implements org.j8unit.repository.javax.xml.ws.spi.http.HttpHandlerClassTests<javax.xml.ws.spi.http.HttpHandler> {

    @Override
    public Class<javax.xml.ws.spi.http.HttpHandler> createNewSUT() {
        return javax.xml.ws.spi.http.HttpHandler.class;
    }

}
