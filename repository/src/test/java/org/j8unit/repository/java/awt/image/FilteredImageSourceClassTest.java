package org.j8unit.repository.java.awt.image;

import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilteredImageSourceClassTest
implements org.j8unit.repository.java.awt.image.FilteredImageSourceClassTests<FilteredImageSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.FilteredImageSource]

    @Override
    public Class<FilteredImageSource> createNewSUT() {
        return FilteredImageSource.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link FilteredImageSource#FilteredImageSource(ImageProducer, ImageFilter) public
     * java.awt.image.FilteredImageSource(java.awt.image.ImageProducer,java.awt.image.ImageFilter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_FilteredImageSource_ImageProducer_ImageFilter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FilteredImageSource sut = null; // = new FilteredImageSource(ImageProducer, ImageFilter);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.FilteredImageSource]

}
