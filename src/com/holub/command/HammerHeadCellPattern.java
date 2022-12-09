package com.holub.command;

import com.holub.life.Cell;

/*
* HammerHead pattern reference
* https://www.researchgate.net/figure/Examples-of-stable-patterns-in-Conways-Game-of-Life_fig2_320019435
* */
public class HammerHeadCellPattern extends CellPattern {

    public HammerHeadCellPattern(Cell outermostCell) {
        super(outermostCell);
    }

    @Override
    void setDeltaIndex(){
        deltaIndex = new int[][]{
                {0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 4},
                {1, 0}, {1, 5}, {1, 13},  {1, 14},
                {2, 0}, {2, 12}, {2, 13}, {2, 15}, {2, 16}, {2, 17},
                {3, 1}, {3, 11}, {3, 12}, {3, 14}, {3, 15}, {3, 16}, {3, 17},
                {4, 3},{4, 4}, {4, 8}, {4, 9}, {4, 11}, {4, 12}, {4, 15}, {4, 16},
                {5, 5},{5, 10},{5, 13},
                {6, 6},{6, 8},{6, 10}, {6, 12},
                {7, 7},
                {8, 7},
                {9, 6},{9, 8},{9, 10}, {9, 12},
                {10, 5},{10, 10},{10, 13},
                {11, 3},{11, 4}, {11, 8}, {11, 9}, {11, 11}, {11, 12}, {11, 15}, {11, 16},
                {12, 1}, {12, 11}, {12, 12}, {12, 14}, {12, 15}, {12, 16}, {12, 17},
                {13, 0}, {13, 12}, {13, 13}, {13, 15}, {13, 16}, {13, 17},
                {14, 0}, {14, 5}, {14, 13},  {14, 14},
                {15, 0}, {15, 1}, {15, 2}, {15, 3}, {15, 4},
        };
    }

}
