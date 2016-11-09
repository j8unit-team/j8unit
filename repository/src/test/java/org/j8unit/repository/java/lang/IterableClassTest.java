package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Iterable} (by simply reusing the J8Unit
 * test interface {@link IterableClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class IterableClassTest
implements IterableClassTests<Iterable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Iterable]

    @Override
    public Class<Iterable> createNewSUT() {
        return Iterable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Iterable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Iterable]

}
