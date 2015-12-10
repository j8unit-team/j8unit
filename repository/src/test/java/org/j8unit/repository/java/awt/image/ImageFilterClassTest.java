package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageFilterClassTest
implements org.j8unit.repository.java.awt.image.ImageFilterClassTests<java.awt.image.ImageFilter> {

    @Override
    public Class<java.awt.image.ImageFilter> createNewSUT() {
        return java.awt.image.ImageFilter.class;
    }

}
