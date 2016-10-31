package org.j8unit.repository.javax.xml.namespace;

import javax.xml.namespace.QName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QNameTest
implements org.j8unit.repository.javax.xml.namespace.QNameTests<QName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.namespace.QName]

    @Override
    public QName createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.namespace.QName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.namespace.QName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.namespace.QName]

}
