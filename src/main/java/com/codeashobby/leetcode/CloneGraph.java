/**
 * Copyright (c) 2015 Ovitas Inc, All rights reserved.
 */
package com.codeashobby.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.codeashobby.leetcode.parent.UndirectedGraphNode;
import org.junit.Test;

/**
 * Description: Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 *
 * @author hzhou
 */
public class CloneGraph {

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if (node == null) {
			return null;
		}

		Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
		Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();

		UndirectedGraphNode newHead = new UndirectedGraphNode(node.label);

		queue.add(node);
		map.put(node, newHead);

		while (!queue.isEmpty()) {
			UndirectedGraphNode curr = queue.poll();

			for (UndirectedGraphNode n : curr.neighbors) {
				if (!map.containsKey(n)) {
					UndirectedGraphNode copy = new UndirectedGraphNode(n.label);
					map.put(n, copy);
					queue.add(n);
				}
				map.get(curr).neighbors.add(map.get(n));
			}
		}
		return newHead;
	}

	@Test
	public void test() {
		UndirectedGraphNode node = new UndirectedGraphNode(1);
	}
}