package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.NoType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NoType} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.lang.model.type.NoTypeTests}).
 */

@RunWith(J8Unit4.class)
public class NoTypeTest
implements NoTypeTests<NoType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.NoType]

    @Override
    public NoType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.type.NoType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.NoType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.NoType]

}
