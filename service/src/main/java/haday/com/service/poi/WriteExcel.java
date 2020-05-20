package haday.com.service.poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import haday.com.service.eneity.Material;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月20日
 * @time: 下午6:08:36
 */

public class WriteExcel {

	public static void writeExcel(OutputStream outputStream, List<Material> data) {

		/**
		 * 这个outputstream可以来自与文件的输出流， 也可以直接输出到response的getOutputStream()里面
		 * 然后用户就可以直接解析到你生产的excel文件了
		 */
		Workbook wb = new SXSSFWorkbook(100);
		// 创建一个工作本
		Sheet sheet = wb.createSheet("sheet");
		// 通过一个sheet创建一个Row
		Row row = sheet.createRow(0);
		// 通过row创建一个cell
		row.createCell(0).setCellValue("表头物料");
		row.createCell(1).setCellValue("投入物料");
		row.createCell(2).setCellValue("单耗");
		row.createCell(3).setCellValue("月份");
		row.createCell(4).setCellValue("本期产量");
		row.createCell(5).setCellValue("本期消耗");

		int rowNum = 1;
		for (Material material : data) {
			// 通过一个sheet创建一个Row
			row = sheet.createRow(rowNum);
			// 通过row创建一个cell
			row.createCell(0).setCellValue(material.getMatCode());
			row.createCell(1).setCellValue(material.getReqCode());
			row.createCell(2).setCellValue(material.getUnit());
			row.createCell(3).setCellValue(material.getMonth());
			row.createCell(4).setCellValue(material.getOutput());
			row.createCell(5).setCellValue(material.getConsume());
			rowNum++;

		}

		try {
			wb.write(outputStream);
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		FileOutputStream stream = null;
		try {
			stream = new FileOutputStream("C:\\Project\\WorkSpace3\\gradle\\service\\src\\main\\resources\\111.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// writeExcel(stream);
	}
}
