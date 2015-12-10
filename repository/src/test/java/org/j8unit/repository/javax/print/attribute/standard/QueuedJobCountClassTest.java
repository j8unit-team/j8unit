package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QueuedJobCountClassTest
implements org.j8unit.repository.javax.print.attribute.standard.QueuedJobCountClassTests<javax.print.attribute.standard.QueuedJobCount> {

    @Override
    public Class<javax.print.attribute.standard.QueuedJobCount> createNewSUT() {
        return javax.print.attribute.standard.QueuedJobCount.class;
    }

}
