package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextClassTest
implements org.j8unit.repository.org.w3c.dom.TextClassTests<org.w3c.dom.Text> {

    @Override
    public Class<org.w3c.dom.Text> createNewSUT() {
        return org.w3c.dom.Text.class;
    }

}
