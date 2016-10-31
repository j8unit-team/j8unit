package org.j8unit.repository.java.rmi.server;

import java.rmi.server.Unreferenced;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnreferencedClassTest
implements org.j8unit.repository.java.rmi.server.UnreferencedClassTests<Unreferenced> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.Unreferenced]

    @Override
    public Class<Unreferenced> createNewSUT() {
        return Unreferenced.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.Unreferenced]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.Unreferenced]

}
