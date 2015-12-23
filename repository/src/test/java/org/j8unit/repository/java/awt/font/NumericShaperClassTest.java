package org.j8unit.repository.java.awt.font;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NumericShaperClassTest
implements org.j8unit.repository.java.awt.font.NumericShaperClassTests<java.awt.font.NumericShaper> {

    @Override
    public Class<java.awt.font.NumericShaper> createNewSUT() {
        return java.awt.font.NumericShaper.class;
    }

    @RunWith(J8Unit4.class)
    public static class RangeClassTest
    implements org.j8unit.repository.java.awt.font.NumericShaperClassTests.RangeClassTests<java.awt.font.NumericShaper.Range> {

        @Override
        public Class<java.awt.font.NumericShaper.Range> createNewSUT() {
            return java.awt.font.NumericShaper.Range.class;
        }

    }

}
