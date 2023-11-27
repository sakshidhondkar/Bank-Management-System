
public class Account {
	private int acNo;
	private String acType;
	private String acHolder;
	private double acBalance;
	
	public Account(int acNo, String acType, String acHolder, double acBalance) {
		super();
		this.acNo = acNo;
		this.acType = acType;
		this.acHolder = acHolder;
		this.acBalance = acBalance;
	}

	public int getAcNo() {
		return acNo;
	}

	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public String getAcHolder() {
		return acHolder;
	}

	public void setAcHolder(String acHolder) {
		this.acHolder = acHolder;
	}

	public double getAcBalance() {
		return acBalance;
	}

	public void setAcBalance(double acBalance) {
		this.acBalance = acBalance;
	}
	
	

}
