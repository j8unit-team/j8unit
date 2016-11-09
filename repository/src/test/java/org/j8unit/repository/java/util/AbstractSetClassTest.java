package org.j8unit.repository.java.util;

import java.util.AbstractSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractSet} (by simply reusing the
 * J8Unit test interface {@link AbstractSetClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractSetClassTest
implements AbstractSetClassTests<AbstractSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractSet]

    @Override
    public Class<AbstractSet> createNewSUT() {
        return AbstractSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.AbstractSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractSet]

}
