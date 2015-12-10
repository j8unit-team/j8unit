package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class OptionalClassTest
implements org.j8unit.repository.java.util.OptionalClassTests<java.util.Optional> {

    @Override
    public Class<java.util.Optional> createNewSUT() {
        return java.util.Optional.class;
    }

}
