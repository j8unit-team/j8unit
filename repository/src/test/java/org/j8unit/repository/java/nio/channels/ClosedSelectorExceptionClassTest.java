package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedSelectorExceptionClassTest
implements org.j8unit.repository.java.nio.channels.ClosedSelectorExceptionClassTests<java.nio.channels.ClosedSelectorException> {

    @Override
    public Class<java.nio.channels.ClosedSelectorException> createNewSUT() {
        return java.nio.channels.ClosedSelectorException.class;
    }

}
