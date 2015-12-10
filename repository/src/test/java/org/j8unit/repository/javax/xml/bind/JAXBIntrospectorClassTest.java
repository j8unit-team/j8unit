package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBIntrospectorClassTest
implements org.j8unit.repository.javax.xml.bind.JAXBIntrospectorClassTests<javax.xml.bind.JAXBIntrospector> {

    @Override
    public Class<javax.xml.bind.JAXBIntrospector> createNewSUT() {
        return javax.xml.bind.JAXBIntrospector.class;
    }

}
