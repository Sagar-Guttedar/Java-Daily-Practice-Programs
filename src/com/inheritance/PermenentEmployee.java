package com.inheritance;

public class PermenentEmployee extends ContractEmployee{
    float bonus;
    int leaves;

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }
}
