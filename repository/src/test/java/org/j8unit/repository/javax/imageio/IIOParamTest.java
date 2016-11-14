package org.j8unit.repository.javax.imageio;

import javax.imageio.IIOParam;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IIOParam} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.imageio.IIOParamTests}).
 */

@RunWith(J8Unit4.class)
public class IIOParamTest
implements IIOParamTests<IIOParam> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.IIOParam]

    @Override
    public IIOParam createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.IIOParam], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.imageio.IIOParam]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.imageio.IIOParam]

}
