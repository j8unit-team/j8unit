package org.j8unit.repository.java.util;

import java.util.AbstractCollection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractCollection} (by simply reusing
 * the J8Unit test interface {@link AbstractCollectionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractCollectionClassTest
implements AbstractCollectionClassTests<AbstractCollection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractCollection]

    @Override
    public Class<AbstractCollection> createNewSUT() {
        return AbstractCollection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.AbstractCollection]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractCollection]

}
