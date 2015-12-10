package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class VectorClassTest
implements org.j8unit.repository.java.util.VectorClassTests<java.util.Vector> {

    @Override
    public Class<java.util.Vector> createNewSUT() {
        return java.util.Vector.class;
    }

}
