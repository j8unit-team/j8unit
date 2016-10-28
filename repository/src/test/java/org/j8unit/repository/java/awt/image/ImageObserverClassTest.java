package org.j8unit.repository.java.awt.image;

import java.awt.image.ImageObserver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageObserverClassTest
implements org.j8unit.repository.java.awt.image.ImageObserverClassTests<ImageObserver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.ImageObserver]

    @Override
    public Class<ImageObserver> createNewSUT() {
        return ImageObserver.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.ImageObserver]

}
