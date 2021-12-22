package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class testUtil {
   static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
	            
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try{
			reader=new Xls_Reader(System.getProperty("C:/Users/vicky-pc/Desktop/IRCTC_data.xlsx"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		for(int rowNum=2; rowNum<= reader.getRowCount("RegTestData"); rowNum++){
			String UserID= reader.getCellData("RegTestData","UserID", rowNum);
			String Password= reader.getCellData("RegTestData", "Password", rowNum);
			String ConfirmPassword= reader.getCellData("RegTestData", "ConfirmPassword", rowNum);
			String SecurityQuestion= reader.getCellData("RegTestData", "SecurityQuestion", rowNum);
		
		     Object[] ob={"UserID", "Password","ConfirmPassword", "SecurityQuestion" };
		     myData.add(ob);
		}
		return myData;
		
	
	
	
	
}
	
	
	
}
