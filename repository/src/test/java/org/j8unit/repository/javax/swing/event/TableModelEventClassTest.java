package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableModelEventClassTest
implements org.j8unit.repository.javax.swing.event.TableModelEventClassTests<javax.swing.event.TableModelEvent> {

    @Override
    public Class<javax.swing.event.TableModelEvent> createNewSUT() {
        return javax.swing.event.TableModelEvent.class;
    }

}
