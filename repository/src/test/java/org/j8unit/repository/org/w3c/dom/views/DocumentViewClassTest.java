package org.j8unit.repository.org.w3c.dom.views;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentViewClassTest
implements org.j8unit.repository.org.w3c.dom.views.DocumentViewClassTests<org.w3c.dom.views.DocumentView> {

    @Override
    public Class<org.w3c.dom.views.DocumentView> createNewSUT() {
        return org.w3c.dom.views.DocumentView.class;
    }

}
