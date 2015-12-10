package org.j8unit.repository.javax.xml.namespace;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamespaceContextClassTest
implements org.j8unit.repository.javax.xml.namespace.NamespaceContextClassTests<javax.xml.namespace.NamespaceContext> {

    @Override
    public Class<javax.xml.namespace.NamespaceContext> createNewSUT() {
        return javax.xml.namespace.NamespaceContext.class;
    }

}
