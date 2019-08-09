package co.grandcircus.generatedpojos;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ENERC_KCAL", "FAT", "FASAT", "CHOCDF", "FIBTG", "PROCNT", "CHOLE", "NA", "CA", "MG", "K", "FE",
		"ZN", "P", "VITA_RAE", "VITC", "THIA", "RIBF", "NIA", "VITB6A", "FOLDFE", "VITB12", "VITD", "TOCPHA", "VITK1" })
public class TotalDaily {

	@JsonProperty("ENERC_KCAL")
	private TotalValue eNERCKCAL;

	@JsonProperty("FAT")
	private TotalValue fAT;

	@JsonProperty("FASAT")
	private TotalValue fASAT;

	@JsonProperty("CHOCDF")
	private TotalValue cHOCDF;

	@JsonProperty("FIBTG")
	private TotalValue fIBTG;

	@JsonProperty("PROCNT")
	private TotalValue pROCNT;

	@JsonProperty("CHOLE")
	private TotalValue cHOLE;

	@JsonProperty("NA")
	private TotalValue nA;

	@JsonProperty("CA")
	private TotalValue cA;

	@JsonProperty("MG")
	private TotalValue mG;

	@JsonProperty("K")
	private TotalValue k;

	@JsonProperty("FE")
	private TotalValue fE;

	@JsonProperty("ZN")
	private TotalValue zN;

	@JsonProperty("P")
	private TotalValue p;

	@JsonProperty("VITA_RAE")
	private TotalValue vITARAE;

	@JsonProperty("VITC")
	private TotalValue vITC;

	@JsonProperty("THIA")
	private TotalValue tHIA;

	@JsonProperty("RIBF")
	private TotalValue rIBF;

	@JsonProperty("NIA")
	private TotalValue nIA;

	@JsonProperty("VITB6A")
	private TotalValue vITB6A;

	@JsonProperty("FOLDFE")
	private TotalValue fOLDFE;

	@JsonProperty("VITB12")
	private TotalValue vITB12;

	@JsonProperty("VITD")
	private TotalValue vITD;

	@JsonProperty("TOCPHA")
	private TotalValue tOCPHA;

	@JsonProperty("VITK1")
	private TotalValue vITK1;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {

		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {

		this.additionalProperties.put(name, value);
	}

	public TotalValue geteNERCKCAL() {

		return eNERCKCAL;
	}

	public void seteNERCKCAL(TotalValue eNERCKCAL) {

		this.eNERCKCAL = eNERCKCAL;
	}

	public TotalValue getfAT() {

		return fAT;
	}

	public void setfAT(TotalValue fAT) {

		this.fAT = fAT;
	}

	public TotalValue getfASAT() {

		return fASAT;
	}

	public void setfASAT(TotalValue fASAT) {

		this.fASAT = fASAT;
	}

	public TotalValue getcHOCDF() {

		return cHOCDF;
	}

	public void setcHOCDF(TotalValue cHOCDF) {

		this.cHOCDF = cHOCDF;
	}

	public TotalValue getfIBTG() {

		return fIBTG;
	}

	public void setfIBTG(TotalValue fIBTG) {

		this.fIBTG = fIBTG;
	}

	public TotalValue getpROCNT() {

		return pROCNT;
	}

	public void setpROCNT(TotalValue pROCNT) {

		this.pROCNT = pROCNT;
	}

	public TotalValue getcHOLE() {

		return cHOLE;
	}

	public void setcHOLE(TotalValue cHOLE) {

		this.cHOLE = cHOLE;
	}

	public TotalValue getnA() {

		return nA;
	}

	public void setnA(TotalValue nA) {

		this.nA = nA;
	}

	public TotalValue getcA() {

		return cA;
	}

	public void setcA(TotalValue cA) {

		this.cA = cA;
	}

	public TotalValue getmG() {

		return mG;
	}

	public void setmG(TotalValue mG) {

		this.mG = mG;
	}

	public TotalValue getK() {

		return k;
	}

	public void setK(TotalValue k) {

		this.k = k;
	}

	public TotalValue getfE() {

		return fE;
	}

	public void setfE(TotalValue fE) {

		this.fE = fE;
	}

	public TotalValue getzN() {

		return zN;
	}

	public void setzN(TotalValue zN) {

		this.zN = zN;
	}

	public TotalValue getP() {

		return p;
	}

	public void setP(TotalValue p) {

		this.p = p;
	}

	public TotalValue getvITARAE() {

		return vITARAE;
	}

	public void setvITARAE(TotalValue vITARAE) {

		this.vITARAE = vITARAE;
	}

	public TotalValue getvITC() {

		return vITC;
	}

	public void setvITC(TotalValue vITC) {

		this.vITC = vITC;
	}

	public TotalValue gettHIA() {

		return tHIA;
	}

	public void settHIA(TotalValue tHIA) {

		this.tHIA = tHIA;
	}

	public TotalValue getrIBF() {

		return rIBF;
	}

	public void setrIBF(TotalValue rIBF) {

		this.rIBF = rIBF;
	}

	public TotalValue getnIA() {

		return nIA;
	}

	public void setnIA(TotalValue nIA) {

		this.nIA = nIA;
	}

	public TotalValue getvITB6A() {

		return vITB6A;
	}

	public void setvITB6A(TotalValue vITB6A) {

		this.vITB6A = vITB6A;
	}

	public TotalValue getfOLDFE() {

		return fOLDFE;
	}

	public void setfOLDFE(TotalValue fOLDFE) {

		this.fOLDFE = fOLDFE;
	}

	public TotalValue getvITB12() {

		return vITB12;
	}

	public void setvITB12(TotalValue vITB12) {

		this.vITB12 = vITB12;
	}

	public TotalValue getvITD() {

		return vITD;
	}

	public void setvITD(TotalValue vITD) {

		this.vITD = vITD;
	}

	public TotalValue gettOCPHA() {

		return tOCPHA;
	}

	public void settOCPHA(TotalValue tOCPHA) {

		this.tOCPHA = tOCPHA;
	}

	public TotalValue getvITK1() {

		return vITK1;
	}

	public void setvITK1(TotalValue vITK1) {

		this.vITK1 = vITK1;
	}
}
