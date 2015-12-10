package org.j8unit.repository.javax.xml.datatype;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatatypeFactoryClassTest
implements org.j8unit.repository.javax.xml.datatype.DatatypeFactoryClassTests<javax.xml.datatype.DatatypeFactory> {

    @Override
    public Class<javax.xml.datatype.DatatypeFactory> createNewSUT() {
        return javax.xml.datatype.DatatypeFactory.class;
    }

}
