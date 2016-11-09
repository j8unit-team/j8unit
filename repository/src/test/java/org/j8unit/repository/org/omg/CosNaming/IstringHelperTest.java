package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.IstringHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IstringHelper} (by simply reusing the
 * J8Unit test interface {@link IstringHelperTests}).
 */

@RunWith(J8Unit4.class)
public class IstringHelperTest
implements IstringHelperTests<IstringHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.IstringHelper]

    @Override
    public IstringHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.IstringHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.IstringHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.IstringHelper]

}
