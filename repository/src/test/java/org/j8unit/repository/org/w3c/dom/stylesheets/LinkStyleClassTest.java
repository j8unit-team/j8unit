package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkStyleClassTest
implements org.j8unit.repository.org.w3c.dom.stylesheets.LinkStyleClassTests<org.w3c.dom.stylesheets.LinkStyle> {

    @Override
    public Class<org.w3c.dom.stylesheets.LinkStyle> createNewSUT() {
        return org.w3c.dom.stylesheets.LinkStyle.class;
    }

}
