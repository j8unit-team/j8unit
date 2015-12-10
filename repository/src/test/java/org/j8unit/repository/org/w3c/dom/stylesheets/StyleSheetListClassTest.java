package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StyleSheetListClassTest
implements org.j8unit.repository.org.w3c.dom.stylesheets.StyleSheetListClassTests<org.w3c.dom.stylesheets.StyleSheetList> {

    @Override
    public Class<org.w3c.dom.stylesheets.StyleSheetList> createNewSUT() {
        return org.w3c.dom.stylesheets.StyleSheetList.class;
    }

}
