package org.j8unit.repository.java.awt;

import java.awt.ItemSelectable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ItemSelectableClassTest
implements org.j8unit.repository.java.awt.ItemSelectableClassTests<ItemSelectable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.ItemSelectable]

    @Override
    public Class<ItemSelectable> createNewSUT() {
        return ItemSelectable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.ItemSelectable]

}
