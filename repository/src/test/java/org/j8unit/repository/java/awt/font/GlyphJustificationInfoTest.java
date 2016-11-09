package org.j8unit.repository.java.awt.font;

import java.awt.font.GlyphJustificationInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GlyphJustificationInfo} (by simply
 * reusing the J8Unit test interface {@link GlyphJustificationInfoTests}).
 */

@RunWith(J8Unit4.class)
public class GlyphJustificationInfoTest
implements GlyphJustificationInfoTests<GlyphJustificationInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.GlyphJustificationInfo]

    @Override
    public GlyphJustificationInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.font.GlyphJustificationInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.GlyphJustificationInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.GlyphJustificationInfo]

}
