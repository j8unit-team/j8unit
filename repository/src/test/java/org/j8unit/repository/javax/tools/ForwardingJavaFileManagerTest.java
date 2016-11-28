package org.j8unit.repository.javax.tools;

import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ForwardingJavaFileManager} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.tools.ForwardingJavaFileManagerTests}).
 */
@RunWith(J8Unit4.class)
public class ForwardingJavaFileManagerTest<M extends JavaFileManager>
implements ForwardingJavaFileManagerTests<ForwardingJavaFileManager<M>, M> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.ForwardingJavaFileManager]

    @Override
    public ForwardingJavaFileManager<M> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.tools.ForwardingJavaFileManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.ForwardingJavaFileManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.ForwardingJavaFileManager]

}
