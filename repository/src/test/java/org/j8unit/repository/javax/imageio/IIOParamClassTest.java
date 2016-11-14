package org.j8unit.repository.javax.imageio;

import javax.imageio.IIOParam;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOParam} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.imageio.IIOParamClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOParamClassTest
implements IIOParamClassTests<IIOParam> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.IIOParam]

    @Override
    public Class<IIOParam> createNewSUT() {
        return IIOParam.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.IIOParam]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.IIOParam]

}
