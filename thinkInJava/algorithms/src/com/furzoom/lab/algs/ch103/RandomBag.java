/*
 * Copyright (c) 2013-2017, http://furzoom.com All Rights Reserved.
 *
 */

package com.furzoom.lab.algs.ch103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Description :
 * Author      : mn@furzoom.com
 * Date        : 2017-09-21
 */
public class RandomBag<Item> implements Iterable<Item> {
    private List<Item> items;

    public RandomBag() {
        items = new ArrayList<Item>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public void add(Item item) {
        items.add(item);
    }

    @Override
    public Iterator<Item> iterator() {
        List<Item> datas = new ArrayList<>(items);
        Collections.shuffle(datas);
        return datas.iterator();
    }
}
