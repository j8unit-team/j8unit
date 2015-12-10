package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOExceptionClassTest
implements org.j8unit.repository.javax.imageio.IIOExceptionClassTests<javax.imageio.IIOException> {

    @Override
    public Class<javax.imageio.IIOException> createNewSUT() {
        return javax.imageio.IIOException.class;
    }

}
