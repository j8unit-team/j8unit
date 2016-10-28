package org.j8unit.repository.java.rmi.dgc;

import java.rmi.dgc.DGC;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DGCClassTest
implements org.j8unit.repository.java.rmi.dgc.DGCClassTests<DGC> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.dgc.DGC]

    @Override
    public Class<DGC> createNewSUT() {
        return DGC.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.dgc.DGC]

}
