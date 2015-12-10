package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformerConfigurationExceptionClassTest
implements org.j8unit.repository.javax.xml.transform.TransformerConfigurationExceptionClassTests<javax.xml.transform.TransformerConfigurationException> {

    @Override
    public Class<javax.xml.transform.TransformerConfigurationException> createNewSUT() {
        return javax.xml.transform.TransformerConfigurationException.class;
    }

}
