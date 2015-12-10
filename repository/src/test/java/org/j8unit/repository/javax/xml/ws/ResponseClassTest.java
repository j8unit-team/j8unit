package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ResponseClassTest
implements org.j8unit.repository.javax.xml.ws.ResponseClassTests<javax.xml.ws.Response> {

    @Override
    public Class<javax.xml.ws.Response> createNewSUT() {
        return javax.xml.ws.Response.class;
    }

}
