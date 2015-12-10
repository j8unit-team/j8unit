package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardingJavaFileManagerTest<M extends javax.tools.JavaFileManager>
implements org.j8unit.repository.javax.tools.ForwardingJavaFileManagerTests<javax.tools.ForwardingJavaFileManager<M>, M> {

    @Override
    public javax.tools.ForwardingJavaFileManager<M> createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.tools.ForwardingJavaFileManager] available.");
    }

}
