package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentFragmentClassTest
implements org.j8unit.repository.org.w3c.dom.DocumentFragmentClassTests<org.w3c.dom.DocumentFragment> {

    @Override
    public Class<org.w3c.dom.DocumentFragment> createNewSUT() {
        return org.w3c.dom.DocumentFragment.class;
    }

}
