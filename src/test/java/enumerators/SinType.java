package enumerators;

public enum SinType {
    MURDER("murder"),
    HIJACK("hijack"),
    BLACKMAIL("blackmail"),
    CAR_ACCIDENT("car accident"),
    ROBBERY("robbery");

    private String xpathValue;

    SinType(String xpathValue){
        this.xpathValue = xpathValue;
    }

    public String getXpathValue() {
        return xpathValue;
    }
}
