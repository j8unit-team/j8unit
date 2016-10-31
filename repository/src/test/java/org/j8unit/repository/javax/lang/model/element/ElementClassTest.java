package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.Element;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementClassTest
implements org.j8unit.repository.javax.lang.model.element.ElementClassTests<Element> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.Element]

    @Override
    public Class<Element> createNewSUT() {
        return Element.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.Element]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.Element]

}
