package org.j8unit.repository.java.util.jar;

import java.util.jar.JarEntry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarEntryTest
implements org.j8unit.repository.java.util.jar.JarEntryTests<JarEntry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.JarEntry]

    @Override
    public JarEntry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.jar.JarEntry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.JarEntry]

}
