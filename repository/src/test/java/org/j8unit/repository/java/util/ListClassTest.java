package org.j8unit.repository.java.util;

import java.util.List;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link List} (by simply reusing the J8Unit test
 * interface {@link ListClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ListClassTest
implements ListClassTests<List> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.List]

    @Override
    public Class<List> createNewSUT() {
        return List.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.List]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.List]

}
