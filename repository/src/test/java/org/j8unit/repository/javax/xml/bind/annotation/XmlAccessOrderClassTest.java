package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAccessOrderClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAccessOrderClassTests<javax.xml.bind.annotation.XmlAccessOrder> {

    @Override
    public Class<javax.xml.bind.annotation.XmlAccessOrder> createNewSUT() {
        return javax.xml.bind.annotation.XmlAccessOrder.class;
    }

}