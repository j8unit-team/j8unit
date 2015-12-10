package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementClassTest
implements org.j8unit.repository.javax.xml.bind.ElementClassTests<javax.xml.bind.Element> {

    @Override
    public Class<javax.xml.bind.Element> createNewSUT() {
        return javax.xml.bind.Element.class;
    }

}
