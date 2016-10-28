package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.Namespace;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamespaceClassTest
implements org.j8unit.repository.javax.xml.stream.events.NamespaceClassTests<Namespace> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.Namespace]

    @Override
    public Class<Namespace> createNewSUT() {
        return Namespace.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.Namespace]

}
