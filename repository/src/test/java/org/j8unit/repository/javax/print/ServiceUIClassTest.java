package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceUIClassTest
implements org.j8unit.repository.javax.print.ServiceUIClassTests<javax.print.ServiceUI> {

    @Override
    public Class<javax.print.ServiceUI> createNewSUT() {
        return javax.print.ServiceUI.class;
    }

}
