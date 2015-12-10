package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBExceptionTest
implements org.j8unit.repository.javax.xml.bind.JAXBExceptionTests<javax.xml.bind.JAXBException> {

    @Override
    public javax.xml.bind.JAXBException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.xml.bind.JAXBException] available.");
    }

}
