package me.bag.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dongyc
 */
public class ReadFileUtil {
	
	public static void main(String args[]){
//		ReadFileUtil rfUtil = new ReadFileUtil();
//		
//		List topDomList = new ArrayList();
////		topDomList = rfUtil.readline("E:\\domain\\getTypo\\top9k.txt");
//		topDomList = rfUtil.readline("J:\\date\\alexa\\121113\\daydayUpCtlds4.txt");
//		System.out.println("---listsize--->>"+topDomList.size());
		String aa = readTxtContent("temp.txt");
		System.out.println(aa);
	}
	public static List<String> readline(String file) {
		List topDomainList= new ArrayList();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String readoneline;
			String s;
			while (br.ready()) {
				readoneline = br.readLine();
				if (readoneline != null) {
					String rStr = readoneline.trim();
					rStr = rStr.substring(rStr.indexOf(",")+1, rStr.length());
//					System.out.println(rStr);
					topDomainList.add(rStr);
				} else {
					System.out.println("---->>");
				}
			}
			br.close();
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return topDomainList;
	}
	
	public static List<String> readCompleteLine(String file) {
		List<String> lineList= new ArrayList<String>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String readoneline;
			while (br.ready()) {
				readoneline = br.readLine();
				if (readoneline != null) {
					String rStr = readoneline.trim();
//					System.out.println(rStr);
					lineList.add(rStr);
				} else {
					System.out.println("---->>");
				}
			}
			br.close();
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lineList;
	}
	
	public static String readTxt(String file) {
		String returnTxt = null;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String readoneline;
			while (br.ready()) {
				readoneline = br.readLine();
				if (readoneline != null) {
					String rStr = readoneline.trim();
					rStr = rStr.substring(rStr.indexOf(",")+1, rStr.length());
					returnTxt = rStr;
				} else {
					System.out.println("---->>");
				}
			}
			br.close();
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return returnTxt;
	}
	public static String readTxtContent(String file) {
		File files = null;
		String retData = null;
		BufferedReader br = null;
		StringBuffer buffer = null;
		String childPath = "";
		  try{
			  files = new File(childPath);
		   buffer = new StringBuffer();
		   InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"utf-8");
		   br = new BufferedReader(isr); 
		   int s;
		   while((s = br.read())!=-1){
		    buffer.append((char)s);
		   }
		   retData = buffer.toString();
		  }catch(Exception e){
		   e.printStackTrace();
		  }
		  return retData;
	}
}
