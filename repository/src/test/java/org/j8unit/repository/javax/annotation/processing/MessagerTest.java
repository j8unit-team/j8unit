package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Messager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Messager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.annotation.processing.MessagerTests}).
 */
@RunWith(J8Unit4.class)
public class MessagerTest
implements MessagerTests<Messager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.Messager]

    @Override
    public Messager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.Messager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.processing.Messager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.processing.Messager]

}
