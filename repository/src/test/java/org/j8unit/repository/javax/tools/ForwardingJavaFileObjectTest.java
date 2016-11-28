package org.j8unit.repository.javax.tools;

import javax.tools.ForwardingJavaFileObject;
import javax.tools.JavaFileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ForwardingJavaFileObject} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.tools.ForwardingJavaFileObjectTests}).
 */
@RunWith(J8Unit4.class)
public class ForwardingJavaFileObjectTest<F extends JavaFileObject>
implements ForwardingJavaFileObjectTests<ForwardingJavaFileObject<F>, F> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.ForwardingJavaFileObject]

    @Override
    public ForwardingJavaFileObject<F> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.tools.ForwardingJavaFileObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.ForwardingJavaFileObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.ForwardingJavaFileObject]

}
