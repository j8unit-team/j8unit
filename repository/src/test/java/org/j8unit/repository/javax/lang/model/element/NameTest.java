package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.Name;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Name} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.lang.model.element.NameTests}).
 */
@RunWith(J8Unit4.class)
public class NameTest
implements org.j8unit.repository.javax.lang.model.element.NameTests<Name> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.Name]

    @Override
    public Name createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.element.Name], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.element.Name]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.element.Name]

}
