package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DetailClassTest
implements org.j8unit.repository.javax.xml.soap.DetailClassTests<javax.xml.soap.Detail> {

    @Override
    public Class<javax.xml.soap.Detail> createNewSUT() {
        return javax.xml.soap.Detail.class;
    }

}
