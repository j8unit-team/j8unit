package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamespaceSupportTest
implements org.j8unit.repository.org.xml.sax.helpers.NamespaceSupportTests<org.xml.sax.helpers.NamespaceSupport> {

    @Override
    public org.xml.sax.helpers.NamespaceSupport createNewSUT() {
        return new org.xml.sax.helpers.NamespaceSupport();
    }

}
