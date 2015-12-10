package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceUIFactoryClassTest
implements org.j8unit.repository.javax.print.ServiceUIFactoryClassTests<javax.print.ServiceUIFactory> {

    @Override
    public Class<javax.print.ServiceUIFactory> createNewSUT() {
        return javax.print.ServiceUIFactory.class;
    }

}
