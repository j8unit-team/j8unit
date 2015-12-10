package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBExceptionClassTest
implements org.j8unit.repository.javax.xml.bind.JAXBExceptionClassTests<javax.xml.bind.JAXBException> {

    @Override
    public Class<javax.xml.bind.JAXBException> createNewSUT() {
        return javax.xml.bind.JAXBException.class;
    }

}
