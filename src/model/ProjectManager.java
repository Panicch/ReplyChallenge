package model;

import java.util.Set;

public class ProjectManager extends Replayer{

    private int companyId;
    private int bonus;

    public ProjectManager(int companyId, int bonus, Set<Integer> skills) {
        this.companyId = companyId;
        this.bonus = bonus;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getBonus() {
        return bonus;
    }



}
