/*
 * Copyright (c) 2017. http://furzoom.com/ All rights reversed.
 */

package com.furzoom.lab.algs.ch103;

import java.util.Iterator;

/**
 * Description :
 * Author      : mn@furzoom.com
 * Date        : 2017-09-20
 */
public class ResizingArrayDeque<Item> implements Iterable<Item> {
    private int head;
    private int tail;
    private Item[] deque;

    @SuppressWarnings("unchecked")
    public ResizingArrayDeque() {
        deque = (Item[])new Object[3];
        head = tail = 1;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public int size() {
        return tail - head;
    }

    public void pushLeft(Item item) {
        if (head == 0) {
            resize(3 * size());
        }
        deque[--head] = item;
    }

    public void pushRight(Item item) {
        if (tail == deque.length) {
            resize(3 * size());
        }
        deque[tail++] = item;
    }

    public Item popLeft() {
        if (isEmpty()) {
            return null;
        } else {
            if (size() * 6 < deque.length) {
                resize(size() * 3);
            }
            return deque[head++];
        }
    }

    public Item popRight() {
        if (isEmpty()) {
            return null;
        } else {
            if (size() * 6 < deque.length) {
                resize(size() *  3);
            }
            return deque[--tail];
        }
    }

    @SuppressWarnings("unchecked")
    private void resize(int size) {
        if (size < 3) {
            size = 3;
        }
        Item tmp[] = (Item[])new Object[size];
        int j = size / 3;
        for (int i = head; i < tail; i++) {
            tmp[j++] = deque[i];
        }
        deque = tmp;
        head = size / 3;
        tail = j;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<Item> {
        private int current = head;

        @Override
        public boolean hasNext() {
            return current < tail;
        }

        @Override
        public Item next() {
            return deque[current++];
        }
    }
}
