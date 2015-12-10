package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBContextClassTest
implements org.j8unit.repository.javax.xml.bind.JAXBContextClassTests<javax.xml.bind.JAXBContext> {

    @Override
    public Class<javax.xml.bind.JAXBContext> createNewSUT() {
        return javax.xml.bind.JAXBContext.class;
    }

}
