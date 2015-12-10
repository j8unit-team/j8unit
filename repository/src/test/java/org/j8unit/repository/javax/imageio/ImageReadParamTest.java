package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageReadParamTest
implements org.j8unit.repository.javax.imageio.ImageReadParamTests<javax.imageio.ImageReadParam> {

    @Override
    public javax.imageio.ImageReadParam createNewSUT() {
        return new javax.imageio.ImageReadParam();
    }

}
