package org.j8unit.repository.javax.xml.datatype;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatatypeConfigurationExceptionTest
implements org.j8unit.repository.javax.xml.datatype.DatatypeConfigurationExceptionTests<javax.xml.datatype.DatatypeConfigurationException> {

    @Override
    public javax.xml.datatype.DatatypeConfigurationException createNewSUT() {
        return new javax.xml.datatype.DatatypeConfigurationException();
    }

}
