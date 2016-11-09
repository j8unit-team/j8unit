package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynSequence;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynSequence} (by simply reusing the
 * J8Unit test interface {@link DynSequenceClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynSequenceClassTest
implements DynSequenceClassTests<DynSequence> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynSequence]

    @Override
    public Class<DynSequence> createNewSUT() {
        return DynSequence.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynSequence]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynSequence]

}
