package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IORHelperClassTest
implements org.j8unit.repository.org.omg.IOP.IORHelperClassTests<org.omg.IOP.IORHelper> {

    @Override
    public Class<org.omg.IOP.IORHelper> createNewSUT() {
        return org.omg.IOP.IORHelper.class;
    }

}
