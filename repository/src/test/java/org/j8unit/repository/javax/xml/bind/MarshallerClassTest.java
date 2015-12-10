package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshallerClassTest
implements org.j8unit.repository.javax.xml.bind.MarshallerClassTests<javax.xml.bind.Marshaller> {

    @RunWith(J8Unit4.class)
    public static class ListenerClassTest
    implements org.j8unit.repository.javax.xml.bind.MarshallerClassTests.ListenerClassTests<javax.xml.bind.Marshaller.Listener> {

        @Override
        public Class<javax.xml.bind.Marshaller.Listener> createNewSUT() {
            return javax.xml.bind.Marshaller.Listener.class;
        }

    }

    @Override
    public Class<javax.xml.bind.Marshaller> createNewSUT() {
        return javax.xml.bind.Marshaller.class;
    }

}
