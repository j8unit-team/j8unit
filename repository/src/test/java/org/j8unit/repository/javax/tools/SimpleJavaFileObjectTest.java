package org.j8unit.repository.javax.tools;

import javax.tools.SimpleJavaFileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleJavaFileObjectTest
implements org.j8unit.repository.javax.tools.SimpleJavaFileObjectTests<SimpleJavaFileObject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.SimpleJavaFileObject]

    @Override
    public SimpleJavaFileObject createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.tools.SimpleJavaFileObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.SimpleJavaFileObject]

}
