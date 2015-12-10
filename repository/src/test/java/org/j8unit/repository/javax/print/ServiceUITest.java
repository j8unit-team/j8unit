package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceUITest
implements org.j8unit.repository.javax.print.ServiceUITests<javax.print.ServiceUI> {

    @Override
    public javax.print.ServiceUI createNewSUT() {
        return new javax.print.ServiceUI();
    }

}
