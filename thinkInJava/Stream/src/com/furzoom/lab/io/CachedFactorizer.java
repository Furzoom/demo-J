/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 18, 2016 6:29:15 PM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */

package com.furzoom.lab.io;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName : CachedFactorizer <br>
 * Function : TODO ADD FUNCTION. <br>
 * date : Oct 18, 2016 6:29:15 PM <br>
 * ll
 * 
 * @version
 */
public class CachedFactorizer {
	private long	lastNumber;
	private long[]	lastFactors;
	private long	hits;
	private long	cacheHits;

	public long[] service(long req) {
		if (req == lastNumber) {
			cacheHits++;
			hits++;
			return lastFactors;
		} else {
			hits++;
			lastNumber = req;
			lastFactors = factor(req);
			return lastFactors;
		}
	}

	private long[] factor(long num) {
		ArrayList<Long> al = new ArrayList<Long>();
		al.add(1L);
		for (long i = 2; i <= num; i++) {
			if (i > num)
				break;
			while (num % i == 0) {
				al.add(i);
				num /= i;
			}
		}
		long[] result = new long[al.size()];
		int i = 0;
		Iterator<Long> it = al.iterator();
		while (it.hasNext()) {
			result[i++] = it.next();
		}
		return result;
	}

	@Override
	public String toString() {
		return cacheHits + "/" + hits;
	}
}
