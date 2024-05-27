package com.mvc.controller;

import java.util.Scanner;

import com.mvc.model.PayTable;
import com.mvc.model.Salary;

public class PayTableTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salary[] pt = new Salary[3];
		pt[0] = new PayTable("소서노",750000L,2,3);
		pt[1] = new PayTable("고주몽",800000L,1,4);
		pt[2] = new PayTable("모팔모",650000L,6,2);
		System.out.print("인센티브(%)입력 : ");
		Salary.setIncentive(sc.nextFloat());
		System.out.println("\n                                                   **** 급여 명세서 ****\n");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		System.out.print("    이름    ");
		System.out.print("   기본급    ");
		System.out.print("가족수    ");
		System.out.print("가족수당    ");
		System.out.print("시간외근무    ");
		System.out.print("시간외수당    ");
		System.out.print("세금    ");
		System.out.print("인센티브(%)    ");
		System.out.print("성과금    ");
		System.out.print("        실수령액    ");
		System.out.println();
		for(int i =0;i<pt.length;i++) {
		 PayTable a = (PayTable)(pt[i]);
		 a.calc();
		 a.out();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("인원수 : " + Salary.getVcount());

	}

}
