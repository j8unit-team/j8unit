package org.j8unit.repository.java.awt;

import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RenderingHintsTest
implements org.j8unit.repository.java.awt.RenderingHintsTests<RenderingHints> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.RenderingHints]

    @Override
    public RenderingHints createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.RenderingHints], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.RenderingHints]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.RenderingHints]

    @RunWith(J8Unit4.class)
    public static class KeyTest
    implements org.j8unit.repository.java.awt.RenderingHintsTests.KeyTests<Key> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.RenderingHints$Key]

        @Override
        public Key createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.RenderingHints.Key], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.RenderingHints$Key]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.RenderingHints$Key]

    }

}
