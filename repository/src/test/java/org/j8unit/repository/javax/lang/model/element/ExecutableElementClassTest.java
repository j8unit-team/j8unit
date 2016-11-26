package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.ExecutableElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExecutableElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.element.ExecutableElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class ExecutableElementClassTest
implements ExecutableElementClassTests<ExecutableElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.ExecutableElement]

    @Override
    public Class<ExecutableElement> createNewSUT() {
        return ExecutableElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.ExecutableElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.ExecutableElement]

}
