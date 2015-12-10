package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpURLConnectionClassTest
implements org.j8unit.repository.java.net.HttpURLConnectionClassTests<java.net.HttpURLConnection> {

    @Override
    public Class<java.net.HttpURLConnection> createNewSUT() {
        return java.net.HttpURLConnection.class;
    }

}
