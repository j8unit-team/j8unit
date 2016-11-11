package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingIteratorOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BindingIteratorOperations} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.BindingIteratorOperationsTests}).
 */

@RunWith(J8Unit4.class)
public class BindingIteratorOperationsTest
implements BindingIteratorOperationsTests<BindingIteratorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.BindingIteratorOperations]

    @Override
    public BindingIteratorOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.BindingIteratorOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.BindingIteratorOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.BindingIteratorOperations]

}
