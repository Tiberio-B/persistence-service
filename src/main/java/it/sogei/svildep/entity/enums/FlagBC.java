package it.sogei.svildep.entity.enums;

public enum FlagBC {

    B("BPF"),
    C("Contanti");

    private String specieBC;

    FlagBC(String specieBC) {
        this.specieBC = specieBC;
    }


    @Override
    public String toString() {
        return specieBC;
    }
}
