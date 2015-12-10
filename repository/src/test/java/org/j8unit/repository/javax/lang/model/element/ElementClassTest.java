package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementClassTest
implements org.j8unit.repository.javax.lang.model.element.ElementClassTests<javax.lang.model.element.Element> {

    @Override
    public Class<javax.lang.model.element.Element> createNewSUT() {
        return javax.lang.model.element.Element.class;
    }

}
