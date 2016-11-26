package org.j8unit.repository.javax.tools;

import javax.tools.StandardJavaFileManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StandardJavaFileManager} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.tools.StandardJavaFileManagerTests}).
 */
@RunWith(J8Unit4.class)
public class StandardJavaFileManagerTest
implements StandardJavaFileManagerTests<StandardJavaFileManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.StandardJavaFileManager]

    @Override
    public StandardJavaFileManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.StandardJavaFileManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.StandardJavaFileManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.StandardJavaFileManager]

}
