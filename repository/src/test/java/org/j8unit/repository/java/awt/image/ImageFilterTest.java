package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageFilterTest
implements org.j8unit.repository.java.awt.image.ImageFilterTests<java.awt.image.ImageFilter> {

    @Override
    public java.awt.image.ImageFilter createNewSUT() {
        return new java.awt.image.ImageFilter();
    }

}
