package org.j8unit.repository.java.awt;

import java.awt.ItemSelectable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ItemSelectableTest
implements org.j8unit.repository.java.awt.ItemSelectableTests<ItemSelectable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.ItemSelectable]

    @Override
    public ItemSelectable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.ItemSelectable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.ItemSelectable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.ItemSelectable]

}
