package no.uib.pap.model;

/**
 * Specifies the possible input types for PathwayMatcher as an enum
 */
public enum InputType {
	
    GENES, 				
    ENSEMBL,			
    UNIPROT,			
    PROTEOFORMS,			
    PEPTIDES,		
    MODIFIEDPEPTIDES,
    VCF,	
    RSIDS,	
    CHRBPS,
    UNKNOWN;
	
	public Iterable<InputType> getValues() {
		return this.getValues();
	}
	
	public static boolean isValueOf(String value) {
		for(InputType type : InputType.values()) {
			if(type.toString().equals(value)) {
				return true;
			}
		}
		return false;
	}
}