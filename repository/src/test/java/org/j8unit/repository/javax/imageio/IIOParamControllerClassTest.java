package org.j8unit.repository.javax.imageio;

import javax.imageio.IIOParamController;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOParamController} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.IIOParamControllerClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOParamControllerClassTest
implements IIOParamControllerClassTests<IIOParamController> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.IIOParamController]

    @Override
    public Class<IIOParamController> createNewSUT() {
        return IIOParamController.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.IIOParamController]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.IIOParamController]

}
