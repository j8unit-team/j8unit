package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RasterClassTest
implements org.j8unit.repository.java.awt.image.RasterClassTests<java.awt.image.Raster> {

    @Override
    public Class<java.awt.image.Raster> createNewSUT() {
        return java.awt.image.Raster.class;
    }

}
