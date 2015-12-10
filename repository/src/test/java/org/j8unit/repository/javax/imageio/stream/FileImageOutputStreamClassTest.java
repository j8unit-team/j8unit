package org.j8unit.repository.javax.imageio.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileImageOutputStreamClassTest
implements org.j8unit.repository.javax.imageio.stream.FileImageOutputStreamClassTests<javax.imageio.stream.FileImageOutputStream> {

    @Override
    public Class<javax.imageio.stream.FileImageOutputStream> createNewSUT() {
        return javax.imageio.stream.FileImageOutputStream.class;
    }

}
