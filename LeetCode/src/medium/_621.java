package medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _621 {
	public static void main(String[] args) {
		int n = 1;
		char[] task = new char[] {'A','A','A','A','B','B','B','C','C','C','D','D','D'};
		System.out.println(leastInterval(task, n));
	}
	
	public static int leastInterval(char[] tasks, int n) {
		int maxCharCount = 0;
		int sameMaxCount = 0;
		int[] counter = new int[26];
        for(char task : tasks) {
        	counter[task - 'A']++;
        	if(maxCharCount == counter[task - 'A']) {
        		sameMaxCount++;
        	} else if (maxCharCount < counter[task - 'A']) {
        		maxCharCount = counter[task - 'A'];
        		sameMaxCount = 1;
        	}
        }
        
        int partCount = maxCharCount - 1;
        int partLength = n - (sameMaxCount - 1);
        int emptySlot = partCount * partLength;
        int availableTaske = tasks.length - (maxCharCount * sameMaxCount);
        int idle = Math.max(0, emptySlot - availableTaske);
        return tasks.length + idle;
    }
}
