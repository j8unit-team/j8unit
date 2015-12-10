package org.j8unit.repository.javax.imageio.plugins.bmp;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BMPImageWriteParamTest
implements org.j8unit.repository.javax.imageio.plugins.bmp.BMPImageWriteParamTests<javax.imageio.plugins.bmp.BMPImageWriteParam> {

    @Override
    public javax.imageio.plugins.bmp.BMPImageWriteParam createNewSUT() {
        return new javax.imageio.plugins.bmp.BMPImageWriteParam();
    }

}
