package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.VariableElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link VariableElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.element.VariableElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class VariableElementClassTest
implements VariableElementClassTests<VariableElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.VariableElement]

    @Override
    public Class<VariableElement> createNewSUT() {
        return VariableElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.VariableElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.VariableElement]

}
