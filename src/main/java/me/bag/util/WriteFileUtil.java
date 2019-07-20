package me.bag.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {

	public static void writetxt(List<String> lastList, String fileName) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fileName);//
			bw = new BufferedWriter(fw);
			for(int i =0;i<lastList.size();i++){
				String domainName = (String) lastList.get(i);
				if(domainName!=null){
					bw.write(domainName);
					bw.newLine();
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			bw.flush();
			bw.close();
			fw.close();
		}

	}

}
