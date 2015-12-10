package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageWriteParamClassTest
implements org.j8unit.repository.javax.imageio.ImageWriteParamClassTests<javax.imageio.ImageWriteParam> {

    @Override
    public Class<javax.imageio.ImageWriteParam> createNewSUT() {
        return javax.imageio.ImageWriteParam.class;
    }

}
