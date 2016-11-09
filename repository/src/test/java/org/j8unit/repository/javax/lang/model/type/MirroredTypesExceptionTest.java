package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.MirroredTypesException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MirroredTypesException} (by simply
 * reusing the J8Unit test interface {@link MirroredTypesExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class MirroredTypesExceptionTest
implements MirroredTypesExceptionTests<MirroredTypesException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.MirroredTypesException]

    @Override
    public MirroredTypesException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.lang.model.type.MirroredTypesException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.MirroredTypesException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.MirroredTypesException]

}
