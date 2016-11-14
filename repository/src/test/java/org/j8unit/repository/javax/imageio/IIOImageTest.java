package org.j8unit.repository.javax.imageio;

import javax.imageio.IIOImage;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOImage} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.imageio.IIOImageTests}).
 */

@RunWith(J8Unit4.class)
public class IIOImageTest
implements IIOImageTests<IIOImage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.IIOImage]

    @Override
    public IIOImage createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.imageio.IIOImage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.IIOImage]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.IIOImage]

}
