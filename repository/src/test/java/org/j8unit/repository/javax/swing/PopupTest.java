package org.j8unit.repository.javax.swing;

import javax.swing.Popup;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PopupTest
implements org.j8unit.repository.javax.swing.PopupTests<Popup> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Popup]

    @Override
    public Popup createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.Popup], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Popup]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Popup]

}
