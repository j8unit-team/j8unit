package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeElementClassTest
implements org.j8unit.repository.javax.lang.model.element.TypeElementClassTests<javax.lang.model.element.TypeElement> {

    @Override
    public Class<javax.lang.model.element.TypeElement> createNewSUT() {
        return javax.lang.model.element.TypeElement.class;
    }

}
