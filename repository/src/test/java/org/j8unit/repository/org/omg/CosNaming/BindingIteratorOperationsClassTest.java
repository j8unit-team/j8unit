package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingIteratorOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BindingIteratorOperations} (by simply
 * reusing the J8Unit test interface {@link BindingIteratorOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class BindingIteratorOperationsClassTest
implements BindingIteratorOperationsClassTests<BindingIteratorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.BindingIteratorOperations]

    @Override
    public Class<BindingIteratorOperations> createNewSUT() {
        return BindingIteratorOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.BindingIteratorOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.BindingIteratorOperations]

}
