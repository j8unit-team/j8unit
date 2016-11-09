package org.j8unit.repository.java.util;

import java.util.Collection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Collection} (by simply reusing the J8Unit
 * test interface {@link CollectionClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CollectionClassTest
implements CollectionClassTests<Collection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Collection]

    @Override
    public Class<Collection> createNewSUT() {
        return Collection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Collection]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Collection]

}
