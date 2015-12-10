package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NodeClassTest
implements org.j8unit.repository.javax.xml.soap.NodeClassTests<javax.xml.soap.Node> {

    @Override
    public Class<javax.xml.soap.Node> createNewSUT() {
        return javax.xml.soap.Node.class;
    }

}
