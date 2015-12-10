package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BookTest
implements org.j8unit.repository.java.awt.print.BookTests<java.awt.print.Book> {

    @Override
    public java.awt.print.Book createNewSUT() {
        return new java.awt.print.Book();
    }

}
