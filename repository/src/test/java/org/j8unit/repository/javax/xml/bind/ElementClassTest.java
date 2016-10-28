package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.Element;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementClassTest
implements org.j8unit.repository.javax.xml.bind.ElementClassTests<Element> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.Element]

    @Override
    public Class<Element> createNewSUT() {
        return Element.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.Element]

}
