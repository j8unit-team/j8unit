package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageProducerClassTest
implements org.j8unit.repository.java.awt.image.ImageProducerClassTests<java.awt.image.ImageProducer> {

    @Override
    public Class<java.awt.image.ImageProducer> createNewSUT() {
        return java.awt.image.ImageProducer.class;
    }

}
