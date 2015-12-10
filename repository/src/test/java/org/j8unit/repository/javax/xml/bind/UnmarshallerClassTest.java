package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmarshallerClassTest
implements org.j8unit.repository.javax.xml.bind.UnmarshallerClassTests<javax.xml.bind.Unmarshaller> {

    @RunWith(J8Unit4.class)
    public static class ListenerClassTest
    implements org.j8unit.repository.javax.xml.bind.UnmarshallerClassTests.ListenerClassTests<javax.xml.bind.Unmarshaller.Listener> {

        @Override
        public Class<javax.xml.bind.Unmarshaller.Listener> createNewSUT() {
            return javax.xml.bind.Unmarshaller.Listener.class;
        }

    }

    @Override
    public Class<javax.xml.bind.Unmarshaller> createNewSUT() {
        return javax.xml.bind.Unmarshaller.class;
    }

}
