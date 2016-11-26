package org.j8unit.repository.javax.tools;

import javax.tools.FileObject;
import javax.tools.ForwardingFileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ForwardingFileObject} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.tools.ForwardingFileObjectTests}).
 */
@RunWith(J8Unit4.class)
public class ForwardingFileObjectTest<F extends FileObject>
implements ForwardingFileObjectTests<ForwardingFileObject<F>, F> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.ForwardingFileObject]

    @Override
    public ForwardingFileObject<F> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.tools.ForwardingFileObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.ForwardingFileObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.ForwardingFileObject]

}
