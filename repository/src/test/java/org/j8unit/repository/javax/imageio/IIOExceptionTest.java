package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOExceptionTest
implements org.j8unit.repository.javax.imageio.IIOExceptionTests<javax.imageio.IIOException> {

    @Override
    public javax.imageio.IIOException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.imageio.IIOException] available.");
    }

}
