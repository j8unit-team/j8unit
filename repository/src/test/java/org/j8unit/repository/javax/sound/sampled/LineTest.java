package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.Line;
import javax.sound.sampled.Line.Info;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Line} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.sampled.LineTests}).
 */
@RunWith(J8Unit4.class)
public class LineTest
implements LineTests<Line> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Line]

    @Override
    public Line createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.Line], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.Line]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.Line]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Info} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.LineTests.InfoTests}).
     */
    @RunWith(J8Unit4.class)
    public static class InfoTest
    implements org.j8unit.repository.javax.sound.sampled.LineTests.InfoTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.Line$Info]

        @Override
        public Info createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sound.sampled.Line.Info], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.Line$Info]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.Line$Info]

    }

}
