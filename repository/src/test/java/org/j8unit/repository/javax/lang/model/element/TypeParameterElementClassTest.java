package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.TypeParameterElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TypeParameterElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.element.TypeParameterElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class TypeParameterElementClassTest
implements TypeParameterElementClassTests<TypeParameterElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.TypeParameterElement]

    @Override
    public Class<TypeParameterElement> createNewSUT() {
        return TypeParameterElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.TypeParameterElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.TypeParameterElement]

}
