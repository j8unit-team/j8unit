package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleHyperlinkClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleHyperlinkClassTests<javax.accessibility.AccessibleHyperlink> {

    @Override
    public Class<javax.accessibility.AccessibleHyperlink> createNewSUT() {
        return javax.accessibility.AccessibleHyperlink.class;
    }

}
