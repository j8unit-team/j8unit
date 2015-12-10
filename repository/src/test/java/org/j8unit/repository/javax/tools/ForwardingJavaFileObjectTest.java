package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardingJavaFileObjectTest<F extends javax.tools.JavaFileObject>
implements org.j8unit.repository.javax.tools.ForwardingJavaFileObjectTests<javax.tools.ForwardingJavaFileObject<F>, F> {

    @Override
    public javax.tools.ForwardingJavaFileObject<F> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.tools.ForwardingJavaFileObject] available.");
    }

}
