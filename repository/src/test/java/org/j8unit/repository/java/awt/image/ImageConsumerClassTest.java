package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageConsumerClassTest
implements org.j8unit.repository.java.awt.image.ImageConsumerClassTests<java.awt.image.ImageConsumer> {

    @Override
    public Class<java.awt.image.ImageConsumer> createNewSUT() {
        return java.awt.image.ImageConsumer.class;
    }

}