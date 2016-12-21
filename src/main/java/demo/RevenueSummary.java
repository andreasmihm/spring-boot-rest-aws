package demo;

public class RevenueSummary {

	private double revenueCurrentMonth;
	private double revenueLastMonth;
	private String month;
	
	public RevenueSummary(String month) {
		// TODO Auto-generated constructor stub
		this.month = month;
		revenueCurrentMonth = 254637;
		revenueLastMonth = 226497;
	}

	public double getRevenueCurrentMonth() {
		return revenueCurrentMonth;
	}

	public void setRevenueCurrentMonth(double revenueCurrentMonth) {
		this.revenueCurrentMonth = revenueCurrentMonth;
	}

	public double getRevenueLastMonth() {
		return revenueLastMonth;
	}

	public void setRevenueLastMonth(double revenueLastMonth) {
		this.revenueLastMonth = revenueLastMonth;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getDifference() {
		return revenueCurrentMonth - revenueLastMonth;
	}
	

}
