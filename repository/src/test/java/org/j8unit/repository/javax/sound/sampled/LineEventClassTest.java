package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineEvent.Type;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LineEventClassTest
implements org.j8unit.repository.javax.sound.sampled.LineEventClassTests<LineEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.LineEvent]

    @Override
    public Class<LineEvent> createNewSUT() {
        return LineEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.sampled.LineEvent#LineEvent(javax.sound.sampled.Line, javax.sound.sampled.LineEvent.Type, long)
     * public javax.sound.sampled.LineEvent(javax.sound.sampled.Line,javax.sound.sampled.LineEvent$Type,long)}.
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
    public void create_LineEvent_Line_Type_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LineEvent sut = null; // = new LineEvent(javax.sound.sampled.Line, javax.sound.sampled.LineEvent.Type,
                                    // long);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.LineEvent]

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.sound.sampled.LineEventClassTests.TypeClassTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.LineEvent$Type]

        @Override
        public Class<Type> createNewSUT() {
            return Type.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.LineEvent$Type]

    }

}
