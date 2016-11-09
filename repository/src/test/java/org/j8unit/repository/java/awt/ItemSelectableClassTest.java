package org.j8unit.repository.java.awt;

import java.awt.ItemSelectable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ItemSelectable} (by simply reusing the
 * J8Unit test interface {@link ItemSelectableClassTests}).
 */

@RunWith(J8Unit4.class)
public class ItemSelectableClassTest
implements ItemSelectableClassTests<ItemSelectable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.ItemSelectable]

    @Override
    public Class<ItemSelectable> createNewSUT() {
        return ItemSelectable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.ItemSelectable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.ItemSelectable]

}
