package model;

import java.util.Set;

public class Developer extends Replayer {
    private int companyId;
    private int bonus;
    private Set<Integer> skills;

    public Developer(int companyId, int bonus, Set<Integer> skills) {
        this.companyId = companyId;
        this.bonus = bonus;
        this.skills = skills;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getBonus() {
        return bonus;
    }

    public Set<Integer> getSkills() {
        return skills;
    }
}
