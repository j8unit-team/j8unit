package org.j8unit.repository.javax.xml.namespace;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QNameClassTest
implements org.j8unit.repository.javax.xml.namespace.QNameClassTests<javax.xml.namespace.QName> {

    @Override
    public Class<javax.xml.namespace.QName> createNewSUT() {
        return javax.xml.namespace.QName.class;
    }

}
