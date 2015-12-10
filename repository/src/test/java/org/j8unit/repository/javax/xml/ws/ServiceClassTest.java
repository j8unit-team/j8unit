package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceClassTest
implements org.j8unit.repository.javax.xml.ws.ServiceClassTests<javax.xml.ws.Service> {

    @RunWith(J8Unit4.class)
    public static class ModeClassTest
    implements org.j8unit.repository.javax.xml.ws.ServiceClassTests.ModeClassTests<javax.xml.ws.Service.Mode> {

        @Override
        public Class<javax.xml.ws.Service.Mode> createNewSUT() {
            return javax.xml.ws.Service.Mode.class;
        }

    }

    @Override
    public Class<javax.xml.ws.Service> createNewSUT() {
        return javax.xml.ws.Service.class;
    }

}
