package org.j8unit.repository.javax.imageio.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageOutputStreamClassTest
implements org.j8unit.repository.javax.imageio.stream.ImageOutputStreamClassTests<javax.imageio.stream.ImageOutputStream> {

    @Override
    public Class<javax.imageio.stream.ImageOutputStream> createNewSUT() {
        return javax.imageio.stream.ImageOutputStream.class;
    }

}
