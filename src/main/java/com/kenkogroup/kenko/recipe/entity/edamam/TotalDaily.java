
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
    "CHOCDF",
    "FIBTG",
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
    "VITB12",
    "VITD",
    "TOCPHA",
    "VITK1"
})
@Generated("jsonschema2pojo")
public class TotalDaily implements Serializable
{

    @JsonProperty("ENERC_KCAL")
    private EnercKcal__1 enercKcal;
    @JsonProperty("FAT")
    private Fat__1 fat;
    @JsonProperty("FASAT")
    private Fasat__1 fasat;
    @JsonProperty("CHOCDF")
    private Chocdf__1 chocdf;
    @JsonProperty("FIBTG")
    private Fibtg__1 fibtg;
    @JsonProperty("PROCNT")
    private Procnt__1 procnt;
    @JsonProperty("CHOLE")
    private Chole__1 chole;
    @JsonProperty("NA")
    private Na__1 na;
    @JsonProperty("CA")
    private Ca__1 ca;
    @JsonProperty("MG")
    private Mg__1 mg;
    @JsonProperty("K")
    private K__1 k;
    @JsonProperty("FE")
    private Fe__1 fe;
    @JsonProperty("ZN")
    private Zn__1 zn;
    @JsonProperty("P")
    private P__1 p;
    @JsonProperty("VITA_RAE")
    private VitaRae__1 vitaRae;
    @JsonProperty("VITC")
    private Vitc__1 vitc;
    @JsonProperty("THIA")
    private Thia__1 thia;
    @JsonProperty("RIBF")
    private Ribf__1 ribf;
    @JsonProperty("NIA")
    private Nia__1 nia;
    @JsonProperty("VITB6A")
    private Vitb6a__1 vitb6a;
    @JsonProperty("FOLDFE")
    private Foldfe__1 foldfe;
    @JsonProperty("VITB12")
    private Vitb12__1 vitb12;
    @JsonProperty("VITD")
    private Vitd__1 vitd;
    @JsonProperty("TOCPHA")
    private Tocpha__1 tocpha;
    @JsonProperty("VITK1")
    private Vitk1__1 vitk1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2339535898300855091L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TotalDaily() {
    }

    /**
     * 
     * @param fasat
     * @param enercKcal
     * @param procnt
     * @param chole
     * @param nia
     * @param vitaRae
     * @param ribf
     * @param vitd
     * @param vitc
     * @param vitb6a
     * @param fat
     * @param mg
     * @param vitb12
     * @param tocpha
     * @param foldfe
     * @param ca
     * @param chocdf
     * @param k
     * @param p
     * @param na
     * @param zn
     * @param vitk1
     * @param thia
     * @param fibtg
     * @param fe
     */
    public TotalDaily(EnercKcal__1 enercKcal, Fat__1 fat, Fasat__1 fasat, Chocdf__1 chocdf, Fibtg__1 fibtg, Procnt__1 procnt, Chole__1 chole, Na__1 na, Ca__1 ca, Mg__1 mg, K__1 k, Fe__1 fe, Zn__1 zn, P__1 p, VitaRae__1 vitaRae, Vitc__1 vitc, Thia__1 thia, Ribf__1 ribf, Nia__1 nia, Vitb6a__1 vitb6a, Foldfe__1 foldfe, Vitb12__1 vitb12, Vitd__1 vitd, Tocpha__1 tocpha, Vitk1__1 vitk1) {
        super();
        this.enercKcal = enercKcal;
        this.fat = fat;
        this.fasat = fasat;
        this.chocdf = chocdf;
        this.fibtg = fibtg;
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
        this.vitb12 = vitb12;
        this.vitd = vitd;
        this.tocpha = tocpha;
        this.vitk1 = vitk1;
    }

    @JsonProperty("ENERC_KCAL")
    public EnercKcal__1 getEnercKcal() {
        return enercKcal;
    }

    @JsonProperty("ENERC_KCAL")
    public void setEnercKcal(EnercKcal__1 enercKcal) {
        this.enercKcal = enercKcal;
    }

    public TotalDaily withEnercKcal(EnercKcal__1 enercKcal) {
        this.enercKcal = enercKcal;
        return this;
    }

    @JsonProperty("FAT")
    public Fat__1 getFat() {
        return fat;
    }

    @JsonProperty("FAT")
    public void setFat(Fat__1 fat) {
        this.fat = fat;
    }

    public TotalDaily withFat(Fat__1 fat) {
        this.fat = fat;
        return this;
    }

    @JsonProperty("FASAT")
    public Fasat__1 getFasat() {
        return fasat;
    }

    @JsonProperty("FASAT")
    public void setFasat(Fasat__1 fasat) {
        this.fasat = fasat;
    }

    public TotalDaily withFasat(Fasat__1 fasat) {
        this.fasat = fasat;
        return this;
    }

    @JsonProperty("CHOCDF")
    public Chocdf__1 getChocdf() {
        return chocdf;
    }

    @JsonProperty("CHOCDF")
    public void setChocdf(Chocdf__1 chocdf) {
        this.chocdf = chocdf;
    }

    public TotalDaily withChocdf(Chocdf__1 chocdf) {
        this.chocdf = chocdf;
        return this;
    }

    @JsonProperty("FIBTG")
    public Fibtg__1 getFibtg() {
        return fibtg;
    }

    @JsonProperty("FIBTG")
    public void setFibtg(Fibtg__1 fibtg) {
        this.fibtg = fibtg;
    }

    public TotalDaily withFibtg(Fibtg__1 fibtg) {
        this.fibtg = fibtg;
        return this;
    }

    @JsonProperty("PROCNT")
    public Procnt__1 getProcnt() {
        return procnt;
    }

    @JsonProperty("PROCNT")
    public void setProcnt(Procnt__1 procnt) {
        this.procnt = procnt;
    }

    public TotalDaily withProcnt(Procnt__1 procnt) {
        this.procnt = procnt;
        return this;
    }

    @JsonProperty("CHOLE")
    public Chole__1 getChole() {
        return chole;
    }

    @JsonProperty("CHOLE")
    public void setChole(Chole__1 chole) {
        this.chole = chole;
    }

    public TotalDaily withChole(Chole__1 chole) {
        this.chole = chole;
        return this;
    }

    @JsonProperty("NA")
    public Na__1 getNa() {
        return na;
    }

    @JsonProperty("NA")
    public void setNa(Na__1 na) {
        this.na = na;
    }

    public TotalDaily withNa(Na__1 na) {
        this.na = na;
        return this;
    }

    @JsonProperty("CA")
    public Ca__1 getCa() {
        return ca;
    }

    @JsonProperty("CA")
    public void setCa(Ca__1 ca) {
        this.ca = ca;
    }

    public TotalDaily withCa(Ca__1 ca) {
        this.ca = ca;
        return this;
    }

    @JsonProperty("MG")
    public Mg__1 getMg() {
        return mg;
    }

    @JsonProperty("MG")
    public void setMg(Mg__1 mg) {
        this.mg = mg;
    }

    public TotalDaily withMg(Mg__1 mg) {
        this.mg = mg;
        return this;
    }

    @JsonProperty("K")
    public K__1 getK() {
        return k;
    }

    @JsonProperty("K")
    public void setK(K__1 k) {
        this.k = k;
    }

    public TotalDaily withK(K__1 k) {
        this.k = k;
        return this;
    }

    @JsonProperty("FE")
    public Fe__1 getFe() {
        return fe;
    }

    @JsonProperty("FE")
    public void setFe(Fe__1 fe) {
        this.fe = fe;
    }

    public TotalDaily withFe(Fe__1 fe) {
        this.fe = fe;
        return this;
    }

    @JsonProperty("ZN")
    public Zn__1 getZn() {
        return zn;
    }

    @JsonProperty("ZN")
    public void setZn(Zn__1 zn) {
        this.zn = zn;
    }

    public TotalDaily withZn(Zn__1 zn) {
        this.zn = zn;
        return this;
    }

    @JsonProperty("P")
    public P__1 getP() {
        return p;
    }

    @JsonProperty("P")
    public void setP(P__1 p) {
        this.p = p;
    }

    public TotalDaily withP(P__1 p) {
        this.p = p;
        return this;
    }

    @JsonProperty("VITA_RAE")
    public VitaRae__1 getVitaRae() {
        return vitaRae;
    }

    @JsonProperty("VITA_RAE")
    public void setVitaRae(VitaRae__1 vitaRae) {
        this.vitaRae = vitaRae;
    }

    public TotalDaily withVitaRae(VitaRae__1 vitaRae) {
        this.vitaRae = vitaRae;
        return this;
    }

    @JsonProperty("VITC")
    public Vitc__1 getVitc() {
        return vitc;
    }

    @JsonProperty("VITC")
    public void setVitc(Vitc__1 vitc) {
        this.vitc = vitc;
    }

    public TotalDaily withVitc(Vitc__1 vitc) {
        this.vitc = vitc;
        return this;
    }

    @JsonProperty("THIA")
    public Thia__1 getThia() {
        return thia;
    }

    @JsonProperty("THIA")
    public void setThia(Thia__1 thia) {
        this.thia = thia;
    }

    public TotalDaily withThia(Thia__1 thia) {
        this.thia = thia;
        return this;
    }

    @JsonProperty("RIBF")
    public Ribf__1 getRibf() {
        return ribf;
    }

    @JsonProperty("RIBF")
    public void setRibf(Ribf__1 ribf) {
        this.ribf = ribf;
    }

    public TotalDaily withRibf(Ribf__1 ribf) {
        this.ribf = ribf;
        return this;
    }

    @JsonProperty("NIA")
    public Nia__1 getNia() {
        return nia;
    }

    @JsonProperty("NIA")
    public void setNia(Nia__1 nia) {
        this.nia = nia;
    }

    public TotalDaily withNia(Nia__1 nia) {
        this.nia = nia;
        return this;
    }

    @JsonProperty("VITB6A")
    public Vitb6a__1 getVitb6a() {
        return vitb6a;
    }

    @JsonProperty("VITB6A")
    public void setVitb6a(Vitb6a__1 vitb6a) {
        this.vitb6a = vitb6a;
    }

    public TotalDaily withVitb6a(Vitb6a__1 vitb6a) {
        this.vitb6a = vitb6a;
        return this;
    }

    @JsonProperty("FOLDFE")
    public Foldfe__1 getFoldfe() {
        return foldfe;
    }

    @JsonProperty("FOLDFE")
    public void setFoldfe(Foldfe__1 foldfe) {
        this.foldfe = foldfe;
    }

    public TotalDaily withFoldfe(Foldfe__1 foldfe) {
        this.foldfe = foldfe;
        return this;
    }

    @JsonProperty("VITB12")
    public Vitb12__1 getVitb12() {
        return vitb12;
    }

    @JsonProperty("VITB12")
    public void setVitb12(Vitb12__1 vitb12) {
        this.vitb12 = vitb12;
    }

    public TotalDaily withVitb12(Vitb12__1 vitb12) {
        this.vitb12 = vitb12;
        return this;
    }

    @JsonProperty("VITD")
    public Vitd__1 getVitd() {
        return vitd;
    }

    @JsonProperty("VITD")
    public void setVitd(Vitd__1 vitd) {
        this.vitd = vitd;
    }

    public TotalDaily withVitd(Vitd__1 vitd) {
        this.vitd = vitd;
        return this;
    }

    @JsonProperty("TOCPHA")
    public Tocpha__1 getTocpha() {
        return tocpha;
    }

    @JsonProperty("TOCPHA")
    public void setTocpha(Tocpha__1 tocpha) {
        this.tocpha = tocpha;
    }

    public TotalDaily withTocpha(Tocpha__1 tocpha) {
        this.tocpha = tocpha;
        return this;
    }

    @JsonProperty("VITK1")
    public Vitk1__1 getVitk1() {
        return vitk1;
    }

    @JsonProperty("VITK1")
    public void setVitk1(Vitk1__1 vitk1) {
        this.vitk1 = vitk1;
    }

    public TotalDaily withVitk1(Vitk1__1 vitk1) {
        this.vitk1 = vitk1;
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

    public TotalDaily withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TotalDaily.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("chocdf");
        sb.append('=');
        sb.append(((this.chocdf == null)?"<null>":this.chocdf));
        sb.append(',');
        sb.append("fibtg");
        sb.append('=');
        sb.append(((this.fibtg == null)?"<null>":this.fibtg));
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
