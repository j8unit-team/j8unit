package org.j8unit.repository.java.rmi.dgc;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DGCClassTest
implements org.j8unit.repository.java.rmi.dgc.DGCClassTests<java.rmi.dgc.DGC> {

    @Override
    public Class<java.rmi.dgc.DGC> createNewSUT() {
        return java.rmi.dgc.DGC.class;
    }

}
