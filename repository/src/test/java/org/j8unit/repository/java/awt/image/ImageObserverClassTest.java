package org.j8unit.repository.java.awt.image;

import java.awt.image.ImageObserver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageObserver} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.ImageObserverClassTests}).
 */
@RunWith(J8Unit4.class)
public class ImageObserverClassTest
implements ImageObserverClassTests<ImageObserver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.ImageObserver]

    @Override
    public Class<ImageObserver> createNewSUT() {
        return ImageObserver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.ImageObserver]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.ImageObserver]

}
