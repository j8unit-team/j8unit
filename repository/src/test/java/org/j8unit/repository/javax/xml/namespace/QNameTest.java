package org.j8unit.repository.javax.xml.namespace;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QNameTest
implements org.j8unit.repository.javax.xml.namespace.QNameTests<javax.xml.namespace.QName> {

    @Override
    public javax.xml.namespace.QName createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.namespace.QName] available.");
    }

}
