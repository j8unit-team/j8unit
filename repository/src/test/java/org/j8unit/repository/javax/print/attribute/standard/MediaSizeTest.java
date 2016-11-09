package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSize.Engineering;
import javax.print.attribute.standard.MediaSize.ISO;
import javax.print.attribute.standard.MediaSize.JIS;
import javax.print.attribute.standard.MediaSize.NA;
import javax.print.attribute.standard.MediaSize.Other;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MediaSize} (by simply reusing the
 * J8Unit test interface {@link MediaSizeTests}).
 */

@RunWith(J8Unit4.class)
public class MediaSizeTest
implements MediaSizeTests<MediaSize> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize]

    @Override
    public MediaSize createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.MediaSize], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.MediaSize]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ISO} (by simply reusing the
     * J8Unit test interface {@link ISOTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ISOTest
    implements ISOTests<ISO> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$ISO]

        @Override
        public ISO createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.MediaSize.ISO], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$ISO]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$ISO]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link NA} (by simply reusing the J8Unit
     * test interface {@link NATests}).
     */

    @RunWith(J8Unit4.class)
    public static class NATest
    implements NATests<NA> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$NA]

        @Override
        public NA createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.MediaSize.NA], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$NA]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$NA]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link JIS} (by simply reusing the
     * J8Unit test interface {@link JISTests}).
     */

    @RunWith(J8Unit4.class)
    public static class JISTest
    implements JISTests<JIS> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$JIS]

        @Override
        public JIS createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.MediaSize.JIS], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$JIS]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$JIS]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Engineering} (by simply reusing
     * the J8Unit test interface {@link EngineeringTests}).
     */

    @RunWith(J8Unit4.class)
    public static class EngineeringTest
    implements EngineeringTests<Engineering> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Engineering]

        @Override
        public Engineering createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.MediaSize.Engineering], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Engineering]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Engineering]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Other} (by simply reusing the
     * J8Unit test interface {@link OtherTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OtherTest
    implements OtherTests<Other> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Other]

        @Override
        public Other createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.attribute.standard.MediaSize.Other], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Other]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSize$Other]

    }

}
