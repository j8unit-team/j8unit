package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAAJMetaFactoryClassTest
implements org.j8unit.repository.javax.xml.soap.SAAJMetaFactoryClassTests<javax.xml.soap.SAAJMetaFactory> {

    @Override
    public Class<javax.xml.soap.SAAJMetaFactory> createNewSUT() {
        return javax.xml.soap.SAAJMetaFactory.class;
    }

}
