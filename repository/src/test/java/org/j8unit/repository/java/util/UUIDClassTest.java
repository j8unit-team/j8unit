package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UUIDClassTest
implements org.j8unit.repository.java.util.UUIDClassTests<java.util.UUID> {

    @Override
    public Class<java.util.UUID> createNewSUT() {
        return java.util.UUID.class;
    }

}
