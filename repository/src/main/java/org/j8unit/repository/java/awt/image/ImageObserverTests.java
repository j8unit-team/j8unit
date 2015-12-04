package org.j8unit.repository.java.awt.image;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.image.ImageObserver interface java.awt.image.ImageObserver}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.image.ImageObserverClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ImageObserverTests<SUT extends java.awt.image.ImageObserver>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.ImageObserver#imageUpdate(java.awt.Image,int,int,int,int,int) public
     * abstract boolean java.awt.image.ImageObserver.imageUpdate(java.awt.Image,int,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_imageUpdate_Image_int_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
