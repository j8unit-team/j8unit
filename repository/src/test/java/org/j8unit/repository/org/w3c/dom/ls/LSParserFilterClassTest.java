package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LSParserFilterClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSParserFilterClassTests<org.w3c.dom.ls.LSParserFilter> {

    @Override
    public Class<org.w3c.dom.ls.LSParserFilter> createNewSUT() {
        return org.w3c.dom.ls.LSParserFilter.class;
    }

}
