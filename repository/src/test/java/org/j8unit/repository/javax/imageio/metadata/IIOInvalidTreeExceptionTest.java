package org.j8unit.repository.javax.imageio.metadata;

import javax.imageio.metadata.IIOInvalidTreeException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOInvalidTreeException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.imageio.metadata.IIOInvalidTreeExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class IIOInvalidTreeExceptionTest
implements IIOInvalidTreeExceptionTests<IIOInvalidTreeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.metadata.IIOInvalidTreeException]

    @Override
    public IIOInvalidTreeException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.metadata.IIOInvalidTreeException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.metadata.IIOInvalidTreeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.metadata.IIOInvalidTreeException]

}
