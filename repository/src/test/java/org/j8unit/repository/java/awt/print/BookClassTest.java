package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BookClassTest
implements org.j8unit.repository.java.awt.print.BookClassTests<java.awt.print.Book> {

    @Override
    public Class<java.awt.print.Book> createNewSUT() {
        return java.awt.print.Book.class;
    }

}
