package org.j8unit.repository.javax.imageio;

import javax.imageio.IIOParamController;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOParamController} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.imageio.IIOParamControllerTests}).
 */

@RunWith(J8Unit4.class)
public class IIOParamControllerTest
implements IIOParamControllerTests<IIOParamController> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.IIOParamController]

    @Override
    public IIOParamController createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.IIOParamController], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.IIOParamController]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.IIOParamController]

}
