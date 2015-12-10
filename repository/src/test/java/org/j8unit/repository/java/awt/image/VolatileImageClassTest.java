package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VolatileImageClassTest
implements org.j8unit.repository.java.awt.image.VolatileImageClassTests<java.awt.image.VolatileImage> {

    @Override
    public Class<java.awt.image.VolatileImage> createNewSUT() {
        return java.awt.image.VolatileImage.class;
    }

}
