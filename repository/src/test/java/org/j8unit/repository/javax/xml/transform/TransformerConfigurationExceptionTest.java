package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformerConfigurationExceptionTest
implements org.j8unit.repository.javax.xml.transform.TransformerConfigurationExceptionTests<javax.xml.transform.TransformerConfigurationException> {

    @Override
    public javax.xml.transform.TransformerConfigurationException createNewSUT() {
        return new javax.xml.transform.TransformerConfigurationException();
    }

}
