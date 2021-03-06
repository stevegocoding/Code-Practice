/**
 * Copyright (c) 2015 Ovitas Inc, All rights reserved.
 */
package com.codeashobby.leetcode;

import java.util.Arrays;

import com.codeashobby.leetcode.parent.Interval;

/**
 * Description:
 *
 * @author hzhou
 */
public class MeetingRooms {

	public boolean canAttendMeetings(Interval[] intervals) {
		assert intervals != null : "null input";

		Arrays.sort(intervals, (o1, o2) -> {
			int r = o1.start - o2.start;
			return r == 0 ? o1.end - o2.end : r;
		});

		for (int i = 1; i < intervals.length; i++) {
			Interval i1 = intervals[i - 1];
			Interval i2 = intervals[i];
			if (i1.end > i2.start) {
				return false;
			}
		}

		return true;
	}
}