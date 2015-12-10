package org.j8unit.repository.javax.xml.ws.spi.http;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpExchangeClassTest
implements org.j8unit.repository.javax.xml.ws.spi.http.HttpExchangeClassTests<javax.xml.ws.spi.http.HttpExchange> {

    @Override
    public Class<javax.xml.ws.spi.http.HttpExchange> createNewSUT() {
        return javax.xml.ws.spi.http.HttpExchange.class;
    }

}
