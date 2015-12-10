package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformerFactoryClassTest
implements org.j8unit.repository.javax.xml.transform.TransformerFactoryClassTests<javax.xml.transform.TransformerFactory> {

    @Override
    public Class<javax.xml.transform.TransformerFactory> createNewSUT() {
        return javax.xml.transform.TransformerFactory.class;
    }

}
