package org.j8unit.repository.javax.imageio.plugins.jpeg;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JPEGImageReadParamTest
implements org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGImageReadParamTests<javax.imageio.plugins.jpeg.JPEGImageReadParam> {

    @Override
    public javax.imageio.plugins.jpeg.JPEGImageReadParam createNewSUT() {
        return new javax.imageio.plugins.jpeg.JPEGImageReadParam();
    }

}
