package com.mvc.model;

import com.mvc.view.Output;

public class PayTable extends Salary implements Calculate, Output {

	
	public PayTable() {}
	
	

	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}



	@Override
	public void calc() {
//		familyP 가족수당 : 가족이 3명 미만이면 가족수 *20000, 3명 이상이면 무조건 60000
//		overtimeP 시간외수당 : 시간외근무 * 5000
//		tax 세금 : 기본급의 10%
//		incenP 성과금 : 인센티브 * 기본급
//		totalPay 실수령액 : 기본급 + 가족수당 + 성과금 + 시간외수당 - 세금
		long familyP =(this.getFamily()<3)?this.getFamily()*20000:60000;
		long overtimeP = this.getOvertime()*5000;
		long tax = this.getPay()/10;
		long incenP = (long)(this.getPay()*this.getIncentive());
		long totalPay = this.getPay()+familyP+incenP +overtimeP-tax;
		this.setFamilyP(familyP);
		this.setOvertimeP(overtimeP);
		this.setTax(tax);
		this.setIncenP(incenP);
		this.setTotalPay(totalPay);
	}

	@Override
	public void out() {
		System.out.print("    " +this.getName());
		System.out.print("    " +this.getPay());
		System.out.print("      " +this.getFamily());
		System.out.print("       " +this.getFamilyP());
		System.out.print("            " +this.getOvertime());
		System.out.print("            " +this.getOvertimeP());
		System.out.print("        " +this.getTax());
		System.out.print("        " +this.getIncentive());
		System.out.print("           " +this.getIncenP());
		System.out.print("           " +this.getTotalPay());
		System.out.println();
		
	}
}
