package org.j8unit.repository.java.awt.font;

import java.awt.font.GlyphJustificationInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GlyphJustificationInfo} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.font.GlyphJustificationInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class GlyphJustificationInfoClassTest
implements GlyphJustificationInfoClassTests<GlyphJustificationInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.font.GlyphJustificationInfo]

    @Override
    public Class<GlyphJustificationInfo> createNewSUT() {
        return GlyphJustificationInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.font.GlyphJustificationInfo#GlyphJustificationInfo(float, boolean, int, float, float, boolean, int, float, float)
     * public java.awt.font.GlyphJustificationInfo(float,boolean,int,float,float,boolean,int,float,float)}.
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
    public void create_GlyphJustificationInfo_float_boolean_int_float_float_boolean_int_float_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GlyphJustificationInfo sut = null; // = new GlyphJustificationInfo(float, boolean, int, float, float,
                                                 // boolean, int, float, float);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.font.GlyphJustificationInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.font.GlyphJustificationInfo]

}
