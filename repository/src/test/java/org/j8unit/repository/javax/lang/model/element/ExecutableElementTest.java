package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.ExecutableElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutableElementTest
implements org.j8unit.repository.javax.lang.model.element.ExecutableElementTests<ExecutableElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.ExecutableElement]

    @Override
    public ExecutableElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.element.ExecutableElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.ExecutableElement]

}
