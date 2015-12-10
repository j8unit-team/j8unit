package org.j8unit.repository.javax.imageio.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryCacheImageOutputStreamClassTest
implements org.j8unit.repository.javax.imageio.stream.MemoryCacheImageOutputStreamClassTests<javax.imageio.stream.MemoryCacheImageOutputStream> {

    @Override
    public Class<javax.imageio.stream.MemoryCacheImageOutputStream> createNewSUT() {
        return javax.imageio.stream.MemoryCacheImageOutputStream.class;
    }

}
