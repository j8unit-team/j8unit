package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardingFileObjectTest<F extends javax.tools.FileObject>
implements org.j8unit.repository.javax.tools.ForwardingFileObjectTests<javax.tools.ForwardingFileObject<F>, F> {

    @Override
    public javax.tools.ForwardingFileObject<F> createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.tools.ForwardingFileObject] available.");
    }

}
