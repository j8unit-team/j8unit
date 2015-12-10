package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageObserverClassTest
implements org.j8unit.repository.java.awt.image.ImageObserverClassTests<java.awt.image.ImageObserver> {

    @Override
    public Class<java.awt.image.ImageObserver> createNewSUT() {
        return java.awt.image.ImageObserver.class;
    }

}
