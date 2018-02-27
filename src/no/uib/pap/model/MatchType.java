package no.uib.pap.model;

public enum MatchType {
    STRICT, FLEXIBLE, ONE;

    public static boolean isValueOf(String value) {
        for (MatchType type : MatchType.values()) {
            if (type.toString().equals(value.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}
