package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicLookAndFeel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicLookAndFeelTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicLookAndFeelTests<BasicLookAndFeel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicLookAndFeel]

    @Override
    public BasicLookAndFeel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.basic.BasicLookAndFeel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicLookAndFeel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicLookAndFeel]

}
