package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamespaceClassTest
implements org.j8unit.repository.javax.xml.stream.events.NamespaceClassTests<javax.xml.stream.events.Namespace> {

    @Override
    public Class<javax.xml.stream.events.Namespace> createNewSUT() {
        return javax.xml.stream.events.Namespace.class;
    }

}
