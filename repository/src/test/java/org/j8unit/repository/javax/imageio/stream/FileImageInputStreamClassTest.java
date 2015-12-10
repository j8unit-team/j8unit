package org.j8unit.repository.javax.imageio.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileImageInputStreamClassTest
implements org.j8unit.repository.javax.imageio.stream.FileImageInputStreamClassTests<javax.imageio.stream.FileImageInputStream> {

    @Override
    public Class<javax.imageio.stream.FileImageInputStream> createNewSUT() {
        return javax.imageio.stream.FileImageInputStream.class;
    }

}
