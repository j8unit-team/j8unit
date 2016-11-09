package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingListHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BindingListHelper} (by simply reusing
 * the J8Unit test interface {@link BindingListHelperTests}).
 */

@RunWith(J8Unit4.class)
public class BindingListHelperTest
implements BindingListHelperTests<BindingListHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.BindingListHelper]

    @Override
    public BindingListHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.BindingListHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.BindingListHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.BindingListHelper]

}
