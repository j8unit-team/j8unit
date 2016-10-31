package org.j8unit.repository.java.awt.image;

import static org.junit.Assert.fail;
import java.awt.image.VolatileImage;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VolatileImageClassTest
implements org.j8unit.repository.java.awt.image.VolatileImageClassTests<VolatileImage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.VolatileImage]

    @Override
    public Class<VolatileImage> createNewSUT() {
        return VolatileImage.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.image.VolatileImage#VolatileImage()
     * public java.awt.image.VolatileImage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_VolatileImage()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.VolatileImage]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.VolatileImage]

}
