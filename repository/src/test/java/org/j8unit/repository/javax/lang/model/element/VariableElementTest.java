package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.VariableElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link VariableElement} (by simply reusing
 * the J8Unit test interface {@link VariableElementTests}).
 */

@RunWith(J8Unit4.class)
public class VariableElementTest
implements VariableElementTests<VariableElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.VariableElement]

    @Override
    public VariableElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.element.VariableElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.element.VariableElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.element.VariableElement]

}
