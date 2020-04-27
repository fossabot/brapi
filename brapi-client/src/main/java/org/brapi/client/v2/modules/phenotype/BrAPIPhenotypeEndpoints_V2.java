package org.brapi.client.v2.modules.phenotype;

public class BrAPIPhenotypeEndpoints_V2 {

    public static String getRootPath() {
        return "/brapi/v2";
    }

    public static String getTraitsPath() {
        return getRootPath() + "/traits";
    }

    public static String getTraitsByIdPath(String traitId) {
        return String.format(getRootPath() + "/traits/%s", traitId);
    }

}
