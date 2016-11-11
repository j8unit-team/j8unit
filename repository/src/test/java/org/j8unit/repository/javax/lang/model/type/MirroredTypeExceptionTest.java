package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.MirroredTypeException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MirroredTypeException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.MirroredTypeExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class MirroredTypeExceptionTest
implements MirroredTypeExceptionTests<MirroredTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.MirroredTypeException]

    @Override
    public MirroredTypeException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.lang.model.type.MirroredTypeException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.MirroredTypeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.MirroredTypeException]

}
