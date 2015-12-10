package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DestinationClassTest
implements org.j8unit.repository.javax.print.attribute.standard.DestinationClassTests<javax.print.attribute.standard.Destination> {

    @Override
    public Class<javax.print.attribute.standard.Destination> createNewSUT() {
        return javax.print.attribute.standard.Destination.class;
    }

}
