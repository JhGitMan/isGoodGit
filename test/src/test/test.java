package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringReader;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		
		File f = new File("D:\\자전거\\GPX 파일\\주행기록\\20180813_회사-선유도-회사.gpx");
		FileInputStream fis = new FileInputStream(f);
		byte[] buf = new byte[1024];
		while(fis.read(buf,0,buf.length) != -1){
			
			sb.append(new String(buf));
			
		};
		//System.out.println(sb.toString());
		
		String xmlData = sb.toString();
		
		responseXmlParser(xmlData);
	}
	
	public static HashMap<String,Object> responseXmlParser(String xmlData){
		HashMap<String,Object> parseData = new HashMap<String,Object>();
		 
		DocumentBuilderFactory dbFactory;
		DocumentBuilder dBuilder;
		Document doc;
		try{
		dbFactory = DocumentBuilderFactory.newInstance();
		dBuilder = dbFactory.newDocumentBuilder();
		InputSource is = new InputSource(); // XML entity
		is.setCharacterStream(new StringReader(xmlData));
		doc = dBuilder.parse(is);
		doc.getDocumentElement().normalize();
		
		
		
	}
	

}
