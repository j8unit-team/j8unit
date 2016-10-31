package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Transformer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformerClassTest
implements org.j8unit.repository.javax.xml.transform.TransformerClassTests<Transformer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.Transformer]

    @Override
    public Class<Transformer> createNewSUT() {
        return Transformer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.Transformer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.Transformer]

}
