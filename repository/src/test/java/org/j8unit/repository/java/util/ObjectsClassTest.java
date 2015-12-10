package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectsClassTest
implements org.j8unit.repository.java.util.ObjectsClassTests<java.util.Objects> {

    @Override
    public Class<java.util.Objects> createNewSUT() {
        return java.util.Objects.class;
    }

}
