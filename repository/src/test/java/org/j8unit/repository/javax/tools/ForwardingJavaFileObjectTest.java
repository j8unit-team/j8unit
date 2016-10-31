package org.j8unit.repository.javax.tools;

import javax.tools.ForwardingJavaFileObject;
import javax.tools.JavaFileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardingJavaFileObjectTest<F extends JavaFileObject>
implements org.j8unit.repository.javax.tools.ForwardingJavaFileObjectTests<ForwardingJavaFileObject<F>, F> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.ForwardingJavaFileObject]

    @Override
    public ForwardingJavaFileObject<F> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.tools.ForwardingJavaFileObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.ForwardingJavaFileObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.ForwardingJavaFileObject]

}
