package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementKindClassTest
implements org.j8unit.repository.javax.lang.model.element.ElementKindClassTests<javax.lang.model.element.ElementKind> {

    @Override
    public Class<javax.lang.model.element.ElementKind> createNewSUT() {
        return javax.lang.model.element.ElementKind.class;
    }

}
