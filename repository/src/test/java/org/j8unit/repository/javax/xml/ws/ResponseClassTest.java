package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Response;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ResponseClassTest
implements org.j8unit.repository.javax.xml.ws.ResponseClassTests<Response> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.Response]

    @Override
    public Class<Response> createNewSUT() {
        return Response.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.Response]

}
