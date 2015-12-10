package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamPrintServiceFactoryClassTest
implements org.j8unit.repository.javax.print.StreamPrintServiceFactoryClassTests<javax.print.StreamPrintServiceFactory> {

    @Override
    public Class<javax.print.StreamPrintServiceFactory> createNewSUT() {
        return javax.print.StreamPrintServiceFactory.class;
    }

}
