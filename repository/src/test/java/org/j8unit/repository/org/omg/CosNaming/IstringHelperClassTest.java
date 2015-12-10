package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IstringHelperClassTest
implements org.j8unit.repository.org.omg.CosNaming.IstringHelperClassTests<org.omg.CosNaming.IstringHelper> {

    @Override
    public Class<org.omg.CosNaming.IstringHelper> createNewSUT() {
        return org.omg.CosNaming.IstringHelper.class;
    }

}
