package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageReadParamClassTest
implements org.j8unit.repository.javax.imageio.ImageReadParamClassTests<javax.imageio.ImageReadParam> {

    @Override
    public Class<javax.imageio.ImageReadParam> createNewSUT() {
        return javax.imageio.ImageReadParam.class;
    }

}
