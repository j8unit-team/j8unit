package org.j8unit.tools;

import java.lang.reflect.Method;
import org.junit.Test;

public class FBTest {

    @Test
    public void testName()
    throws Exception {
        for (final Method method : MyNode.class.getDeclaredMethods()) {
            System.out.println(method);
        }
    }

}

class Node<T> {

    public T data;

    public Node(final T data) {
        this.data = data;
    }

    public void setData(final T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class MyNode
extends Node<Integer> {

    public MyNode(final Integer data) {
        super(data);
    }

    @Override
    public void setData(final Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
