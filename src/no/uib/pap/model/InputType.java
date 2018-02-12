package no.uib.pap.model;

/**
 * Specifies the possible input types for PathwayMatcher as an enum
 */
public enum InputType {
    PEPTIDELIST,
    PEPTIDELISTANDMODSITES,
    UNIPROTLIST,
    PROTEOFORMS,
    VCF,
    RSIDLIST,
    ENSEMBLLIST,
    GENELIST, 
    UNKNOWN;
	
	public Iterable<InputType> getValues() {
		return this.getValues();
	}
}