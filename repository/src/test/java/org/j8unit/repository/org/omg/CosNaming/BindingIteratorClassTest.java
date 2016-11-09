package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingIterator;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BindingIterator} (by simply reusing the
 * J8Unit test interface {@link BindingIteratorClassTests}).
 */

@RunWith(J8Unit4.class)
public class BindingIteratorClassTest
implements BindingIteratorClassTests<BindingIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.BindingIterator]

    @Override
    public Class<BindingIterator> createNewSUT() {
        return BindingIterator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.BindingIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.BindingIterator]

}
