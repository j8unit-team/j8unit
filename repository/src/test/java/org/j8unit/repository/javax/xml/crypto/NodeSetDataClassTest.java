package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.NodeSetData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NodeSetData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.NodeSetDataClassTests}).
 */
@RunWith(J8Unit4.class)
public class NodeSetDataClassTest
implements NodeSetDataClassTests<NodeSetData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.NodeSetData]

    @Override
    public Class<NodeSetData> createNewSUT() {
        return NodeSetData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.NodeSetData]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.NodeSetData]

}
