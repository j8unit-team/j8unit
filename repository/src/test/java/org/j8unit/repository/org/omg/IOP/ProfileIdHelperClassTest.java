package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProfileIdHelperClassTest
implements org.j8unit.repository.org.omg.IOP.ProfileIdHelperClassTests<org.omg.IOP.ProfileIdHelper> {

    @Override
    public Class<org.omg.IOP.ProfileIdHelper> createNewSUT() {
        return org.omg.IOP.ProfileIdHelper.class;
    }

}
