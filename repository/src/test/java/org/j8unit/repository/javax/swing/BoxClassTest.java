package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BoxClassTest
implements org.j8unit.repository.javax.swing.BoxClassTests<javax.swing.Box> {

    @Override
    public Class<javax.swing.Box> createNewSUT() {
        return javax.swing.Box.class;
    }

    @RunWith(J8Unit4.class)
    public static class FillerClassTest
    implements org.j8unit.repository.javax.swing.BoxClassTests.FillerClassTests<javax.swing.Box.Filler> {

        @Override
        public Class<javax.swing.Box.Filler> createNewSUT() {
            return javax.swing.Box.Filler.class;
        }

    }

}
