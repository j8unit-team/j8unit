package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedImageClassTest
implements org.j8unit.repository.java.awt.image.BufferedImageClassTests<java.awt.image.BufferedImage> {

    @Override
    public Class<java.awt.image.BufferedImage> createNewSUT() {
        return java.awt.image.BufferedImage.class;
    }

}
