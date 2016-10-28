package org.j8unit.repository.java.awt;

import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TexturePaintClassTest
implements org.j8unit.repository.java.awt.TexturePaintClassTests<TexturePaint> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.TexturePaint]

    @Override
    public Class<TexturePaint> createNewSUT() {
        return TexturePaint.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link TexturePaint#TexturePaint(BufferedImage, Rectangle2D) public
     * java.awt.TexturePaint(java.awt.image.BufferedImage,java.awt.geom.Rectangle2D)}.
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
    public void create_TexturePaint_BufferedImage_Rectangle2D()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TexturePaint sut = null; // = new TexturePaint(BufferedImage, Rectangle2D);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.TexturePaint]

}
