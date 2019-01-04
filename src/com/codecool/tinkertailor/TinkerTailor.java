package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

public class TinkerTailor {

    private List createFullSeq(int N) {
        List<Integer> fullSeq = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            fullSeq.add(i);
        }
        return fullSeq;
    }

    public List excludeElements( int N, int K) {
        List<Integer> excludedSeq = new ArrayList<>();
        List<Integer> fullSeq = createFullSeq(N);
        int idx;
        int startIdx = 0;

        while(fullSeq.size() > 0) {
            idx = (K % fullSeq.size() - 1) + startIdx;

            if(idx < 0) {
                idx = fullSeq.size() - 1;
            } else if(idx == fullSeq.size()) {
                idx = 0;
            }

            excludedSeq.add(fullSeq.get(idx));

            fullSeq.remove(idx);

            startIdx = idx;

        }

        return excludedSeq;
    }
}
