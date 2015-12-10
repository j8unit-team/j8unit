package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameComponentHelperClassTest
implements org.j8unit.repository.org.omg.CosNaming.NameComponentHelperClassTests<org.omg.CosNaming.NameComponentHelper> {

    @Override
    public Class<org.omg.CosNaming.NameComponentHelper> createNewSUT() {
        return org.omg.CosNaming.NameComponentHelper.class;
    }

}
