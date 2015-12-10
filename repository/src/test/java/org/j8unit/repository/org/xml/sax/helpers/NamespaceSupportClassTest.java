package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamespaceSupportClassTest
implements org.j8unit.repository.org.xml.sax.helpers.NamespaceSupportClassTests<org.xml.sax.helpers.NamespaceSupport> {

    @Override
    public Class<org.xml.sax.helpers.NamespaceSupport> createNewSUT() {
        return org.xml.sax.helpers.NamespaceSupport.class;
    }

}
