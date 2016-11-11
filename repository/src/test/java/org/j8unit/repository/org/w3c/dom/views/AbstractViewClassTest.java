package org.j8unit.repository.org.w3c.dom.views;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.views.AbstractView;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.views.AbstractViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractViewClassTest
implements AbstractViewClassTests<AbstractView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.views.AbstractView]

    @Override
    public Class<AbstractView> createNewSUT() {
        return AbstractView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.views.AbstractView]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.views.AbstractView]

}
