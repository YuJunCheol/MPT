package Data;

public class food {
	private String FOOD_CD, DESC_KOR,GROUP_NAME;
	private double NUTR_CONT1,	NUTR_CONT2,	NUTR_CONT3,	NUTR_CONT4,	NUTR_CONT5,
	NUTR_CONT6,	NUTR_CONT7,	NUTR_CONT8;
	private int SERVING_SIZE, RESEARCH_YEAR	;
	
	public food(String FOOD_CD,String DESC_KOR,String GROUP_NAME,double NUTR_CONT1, double NUTR_CONT2,
			double NUTR_CONT3,double NUTR_CONT4,double NUTR_CONT5,double NUTR_CONT6,double NUTR_CONT7,double NUTR_CONT8,
			int SERVING_SIZE, int RESEARCH_YEAR) {
		this.FOOD_CD = FOOD_CD; this.DESC_KOR = DESC_KOR; this.GROUP_NAME = GROUP_NAME;
		this.NUTR_CONT1 = NUTR_CONT1; this.NUTR_CONT2 = NUTR_CONT2; this.NUTR_CONT3 = NUTR_CONT3; this.NUTR_CONT4 = NUTR_CONT4;
		this.NUTR_CONT5 = NUTR_CONT5; this.NUTR_CONT6 = NUTR_CONT6; this.NUTR_CONT7 = NUTR_CONT7; this.NUTR_CONT8 = NUTR_CONT8;
		this.SERVING_SIZE = SERVING_SIZE; this.RESEARCH_YEAR = RESEARCH_YEAR;
	}

	public String getFOOD_CD() {
		return FOOD_CD;
	}

	public void setFOOD_CD(String fOOD_CD) {
		FOOD_CD = fOOD_CD;
	}

	public String getDESC_KOR() {
		return DESC_KOR;
	}

	public void setDESC_KOR(String dESC_KOR) {
		DESC_KOR = dESC_KOR;
	}

	public String getGROUP_NAME() {
		return GROUP_NAME;
	}

	public void setGROUP_NAME(String gROUP_NAME) {
		GROUP_NAME = gROUP_NAME;
	}

	public double getNUTR_CONT1() {
		return NUTR_CONT1;
	}

	public void setNUTR_CONT1(double nUTR_CONT1) {
		NUTR_CONT1 = nUTR_CONT1;
	}

	public double getNUTR_CONT2() {
		return NUTR_CONT2;
	}

	public void setNUTR_CONT2(double nUTR_CONT2) {
		NUTR_CONT2 = nUTR_CONT2;
	}

	public double getNUTR_CONT3() {
		return NUTR_CONT3;
	}

	public void setNUTR_CONT3(double nUTR_CONT3) {
		NUTR_CONT3 = nUTR_CONT3;
	}

	public double getNUTR_CONT4() {
		return NUTR_CONT4;
	}

	public void setNUTR_CONT4(double nUTR_CONT4) {
		NUTR_CONT4 = nUTR_CONT4;
	}

	public double getNUTR_CONT5() {
		return NUTR_CONT5;
	}

	public void setNUTR_CONT5(double nUTR_CONT5) {
		NUTR_CONT5 = nUTR_CONT5;
	}

	public double getNUTR_CONT6() {
		return NUTR_CONT6;
	}

	public void setNUTR_CONT6(double nUTR_CONT6) {
		NUTR_CONT6 = nUTR_CONT6;
	}

	public double getNUTR_CONT7() {
		return NUTR_CONT7;
	}

	public void setNUTR_CONT7(double nUTR_CONT7) {
		NUTR_CONT7 = nUTR_CONT7;
	}

	public double getNUTR_CONT8() {
		return NUTR_CONT8;
	}

	public void setNUTR_CONT8(double nUTR_CONT8) {
		NUTR_CONT8 = nUTR_CONT8;
	}

	public int getSERVING_SIZE() {
		return SERVING_SIZE;
	}

	public void setSERVING_SIZE(int sERVING_SIZE) {
		SERVING_SIZE = sERVING_SIZE;
	}

	public int getRESEARCH_YEAR() {
		return RESEARCH_YEAR;
	}

	public void setRESEARCH_YEAR(int rESEARCH_YEAR) {
		RESEARCH_YEAR = rESEARCH_YEAR;
	}
	
	
	
}
