package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameHelperClassTest
implements org.j8unit.repository.org.omg.CosNaming.NameHelperClassTests<org.omg.CosNaming.NameHelper> {

    @Override
    public Class<org.omg.CosNaming.NameHelper> createNewSUT() {
        return org.omg.CosNaming.NameHelper.class;
    }

}
