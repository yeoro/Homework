package xml;

public class AptDealHistory {
	
	private String 거래금액;
	private String 건축년도;
	private String 년;
	private String 법정동;
	private String 아파트;
	private String 월;
	private String 일;
	private String 전용면적;
	private String 지번;
	private String 지역코드;
	private String 층;
	
	public String get거래금액() {
		return 거래금액;
	}
	public void set거래금액(String 거래금액) {
		this.거래금액 = 거래금액;
	}
	public String get건축년도() {
		return 건축년도;
	}
	public void set건축년도(String 건축년도) {
		this.건축년도 = 건축년도;
	}
	public String get년() {
		return 년;
	}
	public void set년(String 년) {
		this.년 = 년;
	}
	public String get법정동() {
		return 법정동;
	}
	public void set법정동(String 법정동) {
		this.법정동 = 법정동;
	}
	public String get아파트() {
		return 아파트;
	}
	public void set아파트(String 아파트) {
		this.아파트 = 아파트;
	}
	public String get월() {
		return 월;
	}
	public void set월(String 월) {
		this.월 = 월;
	}
	public String get일() {
		return 일;
	}
	public void set일(String 일) {
		this.일 = 일;
	}
	public String get전용면적() {
		return 전용면적;
	}
	public void set전용면적(String 전용면적) {
		this.전용면적 = 전용면적;
	}
	public String get지번() {
		return 지번;
	}
	public void set지번(String 지번) {
		this.지번 = 지번;
	}
	public String get지역코드() {
		return 지역코드;
	}
	public void set지역코드(String 지역코드) {
		this.지역코드 = 지역코드;
	}
	public String get층() {
		return 층;
	}
	public void set층(String 층) {
		this.층 = 층;
	}


	@Override
	public String toString() {
		return "[아파트 명 :" + this.아파트 + " | 법정동 :" + this.법정동 + " | 거래금액 :" + this.거래금액 + "]";
	}
	
}
