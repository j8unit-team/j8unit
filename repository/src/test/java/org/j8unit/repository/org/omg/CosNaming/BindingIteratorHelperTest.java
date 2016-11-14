package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingIteratorHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BindingIteratorHelper} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.BindingIteratorHelperTests}).
 */

@RunWith(J8Unit4.class)
public class BindingIteratorHelperTest
implements BindingIteratorHelperTests<BindingIteratorHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.BindingIteratorHelper]

    @Override
    public BindingIteratorHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.BindingIteratorHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.BindingIteratorHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.BindingIteratorHelper]

}
