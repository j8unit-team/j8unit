package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.TypeElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeElementClassTest
implements org.j8unit.repository.javax.lang.model.element.TypeElementClassTests<TypeElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.TypeElement]

    @Override
    public Class<TypeElement> createNewSUT() {
        return TypeElement.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.TypeElement]

}
