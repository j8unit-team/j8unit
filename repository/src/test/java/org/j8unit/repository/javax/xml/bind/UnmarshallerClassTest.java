package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmarshallerClassTest
implements org.j8unit.repository.javax.xml.bind.UnmarshallerClassTests<javax.xml.bind.Unmarshaller> {

    @Override
    public Class<javax.xml.bind.Unmarshaller> createNewSUT() {
        return javax.xml.bind.Unmarshaller.class;
    }

    @RunWith(J8Unit4.class)
    public static class ListenerClassTest
    implements org.j8unit.repository.javax.xml.bind.UnmarshallerClassTests.ListenerClassTests<javax.xml.bind.Unmarshaller.Listener> {

        @Override
        public Class<javax.xml.bind.Unmarshaller.Listener> createNewSUT() {
            return javax.xml.bind.Unmarshaller.Listener.class;
        }

    }

}
