package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BoxTest
implements org.j8unit.repository.javax.swing.BoxTests<javax.swing.Box> {

    @RunWith(J8Unit4.class)
    public static class FillerTest
    implements org.j8unit.repository.javax.swing.BoxTests.FillerTests<javax.swing.Box.Filler> {

        @Override
        public javax.swing.Box.Filler createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.Box.Filler] available.");
        }

    }

    @Override
    public javax.swing.Box createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.Box] available.");
    }

}
