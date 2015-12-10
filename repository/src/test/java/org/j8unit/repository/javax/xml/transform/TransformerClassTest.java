package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformerClassTest
implements org.j8unit.repository.javax.xml.transform.TransformerClassTests<javax.xml.transform.Transformer> {

    @Override
    public Class<javax.xml.transform.Transformer> createNewSUT() {
        return javax.xml.transform.Transformer.class;
    }

}
