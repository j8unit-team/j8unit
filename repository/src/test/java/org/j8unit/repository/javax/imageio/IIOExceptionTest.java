package org.j8unit.repository.javax.imageio;

import javax.imageio.IIOException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOException} (by simply reusing the
 * J8Unit test interface {@link IIOExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class IIOExceptionTest
implements IIOExceptionTests<IIOException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.IIOException]

    @Override
    public IIOException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.IIOException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.IIOException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.IIOException]

}
