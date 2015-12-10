package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PositionClassTest
implements org.j8unit.repository.javax.swing.text.PositionClassTests<javax.swing.text.Position> {

    @RunWith(J8Unit4.class)
    public static class BiasClassTest
    implements org.j8unit.repository.javax.swing.text.PositionClassTests.BiasClassTests<javax.swing.text.Position.Bias> {

        @Override
        public Class<javax.swing.text.Position.Bias> createNewSUT() {
            return javax.swing.text.Position.Bias.class;
        }

    }

    @Override
    public Class<javax.swing.text.Position> createNewSUT() {
        return javax.swing.text.Position.class;
    }

}
