
package com.kenkogroup.kenko.recipe.entity.edamam;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ENERC_KCAL",
    "FAT",
    "FASAT",
    "FATRN",
    "FAMS",
    "FAPU",
    "CHOCDF",
    "CHOCDF.net",
    "FIBTG",
    "SUGAR",
    "SUGAR.added",
    "PROCNT",
    "CHOLE",
    "NA",
    "CA",
    "MG",
    "K",
    "FE",
    "ZN",
    "P",
    "VITA_RAE",
    "VITC",
    "THIA",
    "RIBF",
    "NIA",
    "VITB6A",
    "FOLDFE",
    "FOLFD",
    "FOLAC",
    "VITB12",
    "VITD",
    "TOCPHA",
    "VITK1",
    "Sugar.alcohol",
    "WATER"
})
@Generated("jsonschema2pojo")
public class TotalNutrients implements Serializable
{

    @JsonProperty("ENERC_KCAL")
    private EnercKcal enercKcal;
    @JsonProperty("FAT")
    private Fat fat;
    @JsonProperty("FASAT")
    private Fasat fasat;
    @JsonProperty("FATRN")
    private Fatrn fatrn;
    @JsonProperty("FAMS")
    private Fams fams;
    @JsonProperty("FAPU")
    private Fapu fapu;
    @JsonProperty("CHOCDF")
    private Chocdf chocdf;
    @JsonProperty("CHOCDF.net")
    private CHOCDFNet cHOCDFNet;
    @JsonProperty("FIBTG")
    private Fibtg fibtg;
    @JsonProperty("SUGAR")
    private Sugar sugar;
    @JsonProperty("SUGAR.added")
    private SUGARAdded sUGARAdded;
    @JsonProperty("PROCNT")
    private Procnt procnt;
    @JsonProperty("CHOLE")
    private Chole chole;
    @JsonProperty("NA")
    private Na na;
    @JsonProperty("CA")
    private Ca ca;
    @JsonProperty("MG")
    private Mg mg;
    @JsonProperty("K")
    private K k;
    @JsonProperty("FE")
    private Fe fe;
    @JsonProperty("ZN")
    private Zn zn;
    @JsonProperty("P")
    private P p;
    @JsonProperty("VITA_RAE")
    private VitaRae vitaRae;
    @JsonProperty("VITC")
    private Vitc vitc;
    @JsonProperty("THIA")
    private Thia thia;
    @JsonProperty("RIBF")
    private Ribf ribf;
    @JsonProperty("NIA")
    private Nia nia;
    @JsonProperty("VITB6A")
    private Vitb6a vitb6a;
    @JsonProperty("FOLDFE")
    private Foldfe foldfe;
    @JsonProperty("FOLFD")
    private Folfd folfd;
    @JsonProperty("FOLAC")
    private Folac folac;
    @JsonProperty("VITB12")
    private Vitb12 vitb12;
    @JsonProperty("VITD")
    private Vitd vitd;
    @JsonProperty("TOCPHA")
    private Tocpha tocpha;
    @JsonProperty("VITK1")
    private Vitk1 vitk1;
    @JsonProperty("Sugar.alcohol")
    private SugarAlcohol sugarAlcohol;
    @JsonProperty("WATER")
    private Water water;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8342260604861132224L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TotalNutrients() {
    }

    /**
     * 
     * @param fasat
     * @param sugarAlcohol
     * @param enercKcal
     * @param procnt
     * @param chole
     * @param nia
     * @param cHOCDFNet
     * @param vitaRae
     * @param fams
     * @param ribf
     * @param folfd
     * @param vitd
     * @param vitc
     * @param vitb6a
     * @param fat
     * @param mg
     * @param vitb12
     * @param tocpha
     * @param foldfe
     * @param fatrn
     * @param ca
     * @param sUGARAdded
     * @param chocdf
     * @param k
     * @param water
     * @param fapu
     * @param p
     * @param na
     * @param zn
     * @param folac
     * @param vitk1
     * @param thia
     * @param fibtg
     * @param sugar
     * @param fe
     */
    public TotalNutrients(EnercKcal enercKcal, Fat fat, Fasat fasat, Fatrn fatrn, Fams fams, Fapu fapu, Chocdf chocdf, CHOCDFNet cHOCDFNet, Fibtg fibtg, Sugar sugar, SUGARAdded sUGARAdded, Procnt procnt, Chole chole, Na na, Ca ca, Mg mg, K k, Fe fe, Zn zn, P p, VitaRae vitaRae, Vitc vitc, Thia thia, Ribf ribf, Nia nia, Vitb6a vitb6a, Foldfe foldfe, Folfd folfd, Folac folac, Vitb12 vitb12, Vitd vitd, Tocpha tocpha, Vitk1 vitk1, SugarAlcohol sugarAlcohol, Water water) {
        super();
        this.enercKcal = enercKcal;
        this.fat = fat;
        this.fasat = fasat;
        this.fatrn = fatrn;
        this.fams = fams;
        this.fapu = fapu;
        this.chocdf = chocdf;
        this.cHOCDFNet = cHOCDFNet;
        this.fibtg = fibtg;
        this.sugar = sugar;
        this.sUGARAdded = sUGARAdded;
        this.procnt = procnt;
        this.chole = chole;
        this.na = na;
        this.ca = ca;
        this.mg = mg;
        this.k = k;
        this.fe = fe;
        this.zn = zn;
        this.p = p;
        this.vitaRae = vitaRae;
        this.vitc = vitc;
        this.thia = thia;
        this.ribf = ribf;
        this.nia = nia;
        this.vitb6a = vitb6a;
        this.foldfe = foldfe;
        this.folfd = folfd;
        this.folac = folac;
        this.vitb12 = vitb12;
        this.vitd = vitd;
        this.tocpha = tocpha;
        this.vitk1 = vitk1;
        this.sugarAlcohol = sugarAlcohol;
        this.water = water;
    }

    @JsonProperty("ENERC_KCAL")
    public EnercKcal getEnercKcal() {
        return enercKcal;
    }

    @JsonProperty("ENERC_KCAL")
    public void setEnercKcal(EnercKcal enercKcal) {
        this.enercKcal = enercKcal;
    }

    public TotalNutrients withEnercKcal(EnercKcal enercKcal) {
        this.enercKcal = enercKcal;
        return this;
    }

    @JsonProperty("FAT")
    public Fat getFat() {
        return fat;
    }

    @JsonProperty("FAT")
    public void setFat(Fat fat) {
        this.fat = fat;
    }

    public TotalNutrients withFat(Fat fat) {
        this.fat = fat;
        return this;
    }

    @JsonProperty("FASAT")
    public Fasat getFasat() {
        return fasat;
    }

    @JsonProperty("FASAT")
    public void setFasat(Fasat fasat) {
        this.fasat = fasat;
    }

    public TotalNutrients withFasat(Fasat fasat) {
        this.fasat = fasat;
        return this;
    }

    @JsonProperty("FATRN")
    public Fatrn getFatrn() {
        return fatrn;
    }

    @JsonProperty("FATRN")
    public void setFatrn(Fatrn fatrn) {
        this.fatrn = fatrn;
    }

    public TotalNutrients withFatrn(Fatrn fatrn) {
        this.fatrn = fatrn;
        return this;
    }

    @JsonProperty("FAMS")
    public Fams getFams() {
        return fams;
    }

    @JsonProperty("FAMS")
    public void setFams(Fams fams) {
        this.fams = fams;
    }

    public TotalNutrients withFams(Fams fams) {
        this.fams = fams;
        return this;
    }

    @JsonProperty("FAPU")
    public Fapu getFapu() {
        return fapu;
    }

    @JsonProperty("FAPU")
    public void setFapu(Fapu fapu) {
        this.fapu = fapu;
    }

    public TotalNutrients withFapu(Fapu fapu) {
        this.fapu = fapu;
        return this;
    }

    @JsonProperty("CHOCDF")
    public Chocdf getChocdf() {
        return chocdf;
    }

    @JsonProperty("CHOCDF")
    public void setChocdf(Chocdf chocdf) {
        this.chocdf = chocdf;
    }

    public TotalNutrients withChocdf(Chocdf chocdf) {
        this.chocdf = chocdf;
        return this;
    }

    @JsonProperty("CHOCDF.net")
    public CHOCDFNet getCHOCDFNet() {
        return cHOCDFNet;
    }

    @JsonProperty("CHOCDF.net")
    public void setCHOCDFNet(CHOCDFNet cHOCDFNet) {
        this.cHOCDFNet = cHOCDFNet;
    }

    public TotalNutrients withCHOCDFNet(CHOCDFNet cHOCDFNet) {
        this.cHOCDFNet = cHOCDFNet;
        return this;
    }

    @JsonProperty("FIBTG")
    public Fibtg getFibtg() {
        return fibtg;
    }

    @JsonProperty("FIBTG")
    public void setFibtg(Fibtg fibtg) {
        this.fibtg = fibtg;
    }

    public TotalNutrients withFibtg(Fibtg fibtg) {
        this.fibtg = fibtg;
        return this;
    }

    @JsonProperty("SUGAR")
    public Sugar getSugar() {
        return sugar;
    }

    @JsonProperty("SUGAR")
    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    public TotalNutrients withSugar(Sugar sugar) {
        this.sugar = sugar;
        return this;
    }

    @JsonProperty("SUGAR.added")
    public SUGARAdded getSUGARAdded() {
        return sUGARAdded;
    }

    @JsonProperty("SUGAR.added")
    public void setSUGARAdded(SUGARAdded sUGARAdded) {
        this.sUGARAdded = sUGARAdded;
    }

    public TotalNutrients withSUGARAdded(SUGARAdded sUGARAdded) {
        this.sUGARAdded = sUGARAdded;
        return this;
    }

    @JsonProperty("PROCNT")
    public Procnt getProcnt() {
        return procnt;
    }

    @JsonProperty("PROCNT")
    public void setProcnt(Procnt procnt) {
        this.procnt = procnt;
    }

    public TotalNutrients withProcnt(Procnt procnt) {
        this.procnt = procnt;
        return this;
    }

    @JsonProperty("CHOLE")
    public Chole getChole() {
        return chole;
    }

    @JsonProperty("CHOLE")
    public void setChole(Chole chole) {
        this.chole = chole;
    }

    public TotalNutrients withChole(Chole chole) {
        this.chole = chole;
        return this;
    }

    @JsonProperty("NA")
    public Na getNa() {
        return na;
    }

    @JsonProperty("NA")
    public void setNa(Na na) {
        this.na = na;
    }

    public TotalNutrients withNa(Na na) {
        this.na = na;
        return this;
    }

    @JsonProperty("CA")
    public Ca getCa() {
        return ca;
    }

    @JsonProperty("CA")
    public void setCa(Ca ca) {
        this.ca = ca;
    }

    public TotalNutrients withCa(Ca ca) {
        this.ca = ca;
        return this;
    }

    @JsonProperty("MG")
    public Mg getMg() {
        return mg;
    }

    @JsonProperty("MG")
    public void setMg(Mg mg) {
        this.mg = mg;
    }

    public TotalNutrients withMg(Mg mg) {
        this.mg = mg;
        return this;
    }

    @JsonProperty("K")
    public K getK() {
        return k;
    }

    @JsonProperty("K")
    public void setK(K k) {
        this.k = k;
    }

    public TotalNutrients withK(K k) {
        this.k = k;
        return this;
    }

    @JsonProperty("FE")
    public Fe getFe() {
        return fe;
    }

    @JsonProperty("FE")
    public void setFe(Fe fe) {
        this.fe = fe;
    }

    public TotalNutrients withFe(Fe fe) {
        this.fe = fe;
        return this;
    }

    @JsonProperty("ZN")
    public Zn getZn() {
        return zn;
    }

    @JsonProperty("ZN")
    public void setZn(Zn zn) {
        this.zn = zn;
    }

    public TotalNutrients withZn(Zn zn) {
        this.zn = zn;
        return this;
    }

    @JsonProperty("P")
    public P getP() {
        return p;
    }

    @JsonProperty("P")
    public void setP(P p) {
        this.p = p;
    }

    public TotalNutrients withP(P p) {
        this.p = p;
        return this;
    }

    @JsonProperty("VITA_RAE")
    public VitaRae getVitaRae() {
        return vitaRae;
    }

    @JsonProperty("VITA_RAE")
    public void setVitaRae(VitaRae vitaRae) {
        this.vitaRae = vitaRae;
    }

    public TotalNutrients withVitaRae(VitaRae vitaRae) {
        this.vitaRae = vitaRae;
        return this;
    }

    @JsonProperty("VITC")
    public Vitc getVitc() {
        return vitc;
    }

    @JsonProperty("VITC")
    public void setVitc(Vitc vitc) {
        this.vitc = vitc;
    }

    public TotalNutrients withVitc(Vitc vitc) {
        this.vitc = vitc;
        return this;
    }

    @JsonProperty("THIA")
    public Thia getThia() {
        return thia;
    }

    @JsonProperty("THIA")
    public void setThia(Thia thia) {
        this.thia = thia;
    }

    public TotalNutrients withThia(Thia thia) {
        this.thia = thia;
        return this;
    }

    @JsonProperty("RIBF")
    public Ribf getRibf() {
        return ribf;
    }

    @JsonProperty("RIBF")
    public void setRibf(Ribf ribf) {
        this.ribf = ribf;
    }

    public TotalNutrients withRibf(Ribf ribf) {
        this.ribf = ribf;
        return this;
    }

    @JsonProperty("NIA")
    public Nia getNia() {
        return nia;
    }

    @JsonProperty("NIA")
    public void setNia(Nia nia) {
        this.nia = nia;
    }

    public TotalNutrients withNia(Nia nia) {
        this.nia = nia;
        return this;
    }

    @JsonProperty("VITB6A")
    public Vitb6a getVitb6a() {
        return vitb6a;
    }

    @JsonProperty("VITB6A")
    public void setVitb6a(Vitb6a vitb6a) {
        this.vitb6a = vitb6a;
    }

    public TotalNutrients withVitb6a(Vitb6a vitb6a) {
        this.vitb6a = vitb6a;
        return this;
    }

    @JsonProperty("FOLDFE")
    public Foldfe getFoldfe() {
        return foldfe;
    }

    @JsonProperty("FOLDFE")
    public void setFoldfe(Foldfe foldfe) {
        this.foldfe = foldfe;
    }

    public TotalNutrients withFoldfe(Foldfe foldfe) {
        this.foldfe = foldfe;
        return this;
    }

    @JsonProperty("FOLFD")
    public Folfd getFolfd() {
        return folfd;
    }

    @JsonProperty("FOLFD")
    public void setFolfd(Folfd folfd) {
        this.folfd = folfd;
    }

    public TotalNutrients withFolfd(Folfd folfd) {
        this.folfd = folfd;
        return this;
    }

    @JsonProperty("FOLAC")
    public Folac getFolac() {
        return folac;
    }

    @JsonProperty("FOLAC")
    public void setFolac(Folac folac) {
        this.folac = folac;
    }

    public TotalNutrients withFolac(Folac folac) {
        this.folac = folac;
        return this;
    }

    @JsonProperty("VITB12")
    public Vitb12 getVitb12() {
        return vitb12;
    }

    @JsonProperty("VITB12")
    public void setVitb12(Vitb12 vitb12) {
        this.vitb12 = vitb12;
    }

    public TotalNutrients withVitb12(Vitb12 vitb12) {
        this.vitb12 = vitb12;
        return this;
    }

    @JsonProperty("VITD")
    public Vitd getVitd() {
        return vitd;
    }

    @JsonProperty("VITD")
    public void setVitd(Vitd vitd) {
        this.vitd = vitd;
    }

    public TotalNutrients withVitd(Vitd vitd) {
        this.vitd = vitd;
        return this;
    }

    @JsonProperty("TOCPHA")
    public Tocpha getTocpha() {
        return tocpha;
    }

    @JsonProperty("TOCPHA")
    public void setTocpha(Tocpha tocpha) {
        this.tocpha = tocpha;
    }

    public TotalNutrients withTocpha(Tocpha tocpha) {
        this.tocpha = tocpha;
        return this;
    }

    @JsonProperty("VITK1")
    public Vitk1 getVitk1() {
        return vitk1;
    }

    @JsonProperty("VITK1")
    public void setVitk1(Vitk1 vitk1) {
        this.vitk1 = vitk1;
    }

    public TotalNutrients withVitk1(Vitk1 vitk1) {
        this.vitk1 = vitk1;
        return this;
    }

    @JsonProperty("Sugar.alcohol")
    public SugarAlcohol getSugarAlcohol() {
        return sugarAlcohol;
    }

    @JsonProperty("Sugar.alcohol")
    public void setSugarAlcohol(SugarAlcohol sugarAlcohol) {
        this.sugarAlcohol = sugarAlcohol;
    }

    public TotalNutrients withSugarAlcohol(SugarAlcohol sugarAlcohol) {
        this.sugarAlcohol = sugarAlcohol;
        return this;
    }

    @JsonProperty("WATER")
    public Water getWater() {
        return water;
    }

    @JsonProperty("WATER")
    public void setWater(Water water) {
        this.water = water;
    }

    public TotalNutrients withWater(Water water) {
        this.water = water;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TotalNutrients withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TotalNutrients.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enercKcal");
        sb.append('=');
        sb.append(((this.enercKcal == null)?"<null>":this.enercKcal));
        sb.append(',');
        sb.append("fat");
        sb.append('=');
        sb.append(((this.fat == null)?"<null>":this.fat));
        sb.append(',');
        sb.append("fasat");
        sb.append('=');
        sb.append(((this.fasat == null)?"<null>":this.fasat));
        sb.append(',');
        sb.append("fatrn");
        sb.append('=');
        sb.append(((this.fatrn == null)?"<null>":this.fatrn));
        sb.append(',');
        sb.append("fams");
        sb.append('=');
        sb.append(((this.fams == null)?"<null>":this.fams));
        sb.append(',');
        sb.append("fapu");
        sb.append('=');
        sb.append(((this.fapu == null)?"<null>":this.fapu));
        sb.append(',');
        sb.append("chocdf");
        sb.append('=');
        sb.append(((this.chocdf == null)?"<null>":this.chocdf));
        sb.append(',');
        sb.append("cHOCDFNet");
        sb.append('=');
        sb.append(((this.cHOCDFNet == null)?"<null>":this.cHOCDFNet));
        sb.append(',');
        sb.append("fibtg");
        sb.append('=');
        sb.append(((this.fibtg == null)?"<null>":this.fibtg));
        sb.append(',');
        sb.append("sugar");
        sb.append('=');
        sb.append(((this.sugar == null)?"<null>":this.sugar));
        sb.append(',');
        sb.append("sUGARAdded");
        sb.append('=');
        sb.append(((this.sUGARAdded == null)?"<null>":this.sUGARAdded));
        sb.append(',');
        sb.append("procnt");
        sb.append('=');
        sb.append(((this.procnt == null)?"<null>":this.procnt));
        sb.append(',');
        sb.append("chole");
        sb.append('=');
        sb.append(((this.chole == null)?"<null>":this.chole));
        sb.append(',');
        sb.append("na");
        sb.append('=');
        sb.append(((this.na == null)?"<null>":this.na));
        sb.append(',');
        sb.append("ca");
        sb.append('=');
        sb.append(((this.ca == null)?"<null>":this.ca));
        sb.append(',');
        sb.append("mg");
        sb.append('=');
        sb.append(((this.mg == null)?"<null>":this.mg));
        sb.append(',');
        sb.append("k");
        sb.append('=');
        sb.append(((this.k == null)?"<null>":this.k));
        sb.append(',');
        sb.append("fe");
        sb.append('=');
        sb.append(((this.fe == null)?"<null>":this.fe));
        sb.append(',');
        sb.append("zn");
        sb.append('=');
        sb.append(((this.zn == null)?"<null>":this.zn));
        sb.append(',');
        sb.append("p");
        sb.append('=');
        sb.append(((this.p == null)?"<null>":this.p));
        sb.append(',');
        sb.append("vitaRae");
        sb.append('=');
        sb.append(((this.vitaRae == null)?"<null>":this.vitaRae));
        sb.append(',');
        sb.append("vitc");
        sb.append('=');
        sb.append(((this.vitc == null)?"<null>":this.vitc));
        sb.append(',');
        sb.append("thia");
        sb.append('=');
        sb.append(((this.thia == null)?"<null>":this.thia));
        sb.append(',');
        sb.append("ribf");
        sb.append('=');
        sb.append(((this.ribf == null)?"<null>":this.ribf));
        sb.append(',');
        sb.append("nia");
        sb.append('=');
        sb.append(((this.nia == null)?"<null>":this.nia));
        sb.append(',');
        sb.append("vitb6a");
        sb.append('=');
        sb.append(((this.vitb6a == null)?"<null>":this.vitb6a));
        sb.append(',');
        sb.append("foldfe");
        sb.append('=');
        sb.append(((this.foldfe == null)?"<null>":this.foldfe));
        sb.append(',');
        sb.append("folfd");
        sb.append('=');
        sb.append(((this.folfd == null)?"<null>":this.folfd));
        sb.append(',');
        sb.append("folac");
        sb.append('=');
        sb.append(((this.folac == null)?"<null>":this.folac));
        sb.append(',');
        sb.append("vitb12");
        sb.append('=');
        sb.append(((this.vitb12 == null)?"<null>":this.vitb12));
        sb.append(',');
        sb.append("vitd");
        sb.append('=');
        sb.append(((this.vitd == null)?"<null>":this.vitd));
        sb.append(',');
        sb.append("tocpha");
        sb.append('=');
        sb.append(((this.tocpha == null)?"<null>":this.tocpha));
        sb.append(',');
        sb.append("vitk1");
        sb.append('=');
        sb.append(((this.vitk1 == null)?"<null>":this.vitk1));
        sb.append(',');
        sb.append("sugarAlcohol");
        sb.append('=');
        sb.append(((this.sugarAlcohol == null)?"<null>":this.sugarAlcohol));
        sb.append(',');
        sb.append("water");
        sb.append('=');
        sb.append(((this.water == null)?"<null>":this.water));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
