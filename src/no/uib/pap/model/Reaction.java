package no.uib.pap.model;

import java.io.Serializable;
import java.util.TreeSet;

public class Reaction implements Comparable<Reaction>, Serializable {
	
	
    private String stId;
    private String displayName;
    private TreeSet<Pathway> pathwaySet;

    public Reaction(String stId, String displayName) {
        this.stId = stId;
        this.displayName = displayName;
        this.pathwaySet = new TreeSet<>();
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TreeSet<Pathway> getPathwaySet() {
        return pathwaySet;
    }

    public void setPathwaySet(TreeSet<Pathway> pathwaySet) {
        this.pathwaySet = pathwaySet;
    }

    @Override
    public String toString() {
    	return this.stId + "\t" + this.displayName;
    }
    
    public String toString(String separator) {
        return this.stId + separator + this.displayName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || !(obj instanceof Reaction)) return false;

        Reaction that = (Reaction) obj;

        return this.stId.equals(that.stId) && this.displayName.equals(that.displayName);
    }

    @Override
    public int compareTo(Reaction that) {
        if (this.equals(that)) return 0;

        // First by displayName
        if (!this.displayName.equals(that.displayName)) {
            return this.displayName.compareTo(that.displayName);
        }

        // Second by stId
        if (!this.stId.equals(that.stId)) {
            return this.stId.compareTo(that.stId);
        }

        assert this.equals(that) : "Check consistency with equals";

        return 0;
    }
}