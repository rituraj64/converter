package com.litepdf.converter.service;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author RAVI
 *
 */
public interface DocToPdfConverter {
	/**
	 * DOC/DOCX to PDF
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 * @throws Exception 
	 */
	//public void docxToPdf();
	
	public String docToPdf(String inPath, String outPath) throws FileNotFoundException, IOException, Exception;

}
