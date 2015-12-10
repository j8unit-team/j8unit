package org.j8unit.repository.org.w3c.dom.views;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractViewClassTest
implements org.j8unit.repository.org.w3c.dom.views.AbstractViewClassTests<org.w3c.dom.views.AbstractView> {

    @Override
    public Class<org.w3c.dom.views.AbstractView> createNewSUT() {
        return org.w3c.dom.views.AbstractView.class;
    }

}
