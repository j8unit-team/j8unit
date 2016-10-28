package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.Detail;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DetailClassTest
implements org.j8unit.repository.javax.xml.soap.DetailClassTests<Detail> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.Detail]

    @Override
    public Class<Detail> createNewSUT() {
        return Detail.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.Detail]

}
