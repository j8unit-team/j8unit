package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleJavaFileObjectTest
implements org.j8unit.repository.javax.tools.SimpleJavaFileObjectTests<javax.tools.SimpleJavaFileObject> {

    @Override
    public javax.tools.SimpleJavaFileObject createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.tools.SimpleJavaFileObject] available.");
    }

}
