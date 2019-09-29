package service.poi;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

import service.eneity.Material;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月20日
 * @time: 下午5:54:25
 */

public class ReadExcel {

	private static Logger logger = LoggerFactory.getLogger(ReadExcel.class);

	public static List<Material> readExcelFile(InputStream inputStream, String fileName) {

		/**
		 * 这个inputStream文件可以来源于本地文件的流， 也可以来源与上传上来的文件的流，也就是MultipartFile的流，
		 * 使用getInputStream()方法进行获取。
		 */

		/**
		 * 然后再读取文件的时候，应该excel文件的后缀名在不同的版本中对应的解析类不一样 要对fileName进行后缀的解析
		 */

		Workbook workbook = null;
		try {
			// 判断什么类型文件
			if (fileName.endsWith(".xls")) {
				workbook = new HSSFWorkbook(inputStream);
			} else if (fileName.endsWith(".xlsx")) {
				workbook = new XSSFWorkbook(inputStream);
			}
		} catch (Exception e) {
			logger.info("文件类型异常，原因为:{}", e.getMessage());
		}
		List<Material> list = Lists.newArrayListWithCapacity(5000);
		if (workbook == null) {
			logger.info("文件内容为空，请检查");
		} else {

			// 获取所有的工作表的的数量
			int numOfSheet = workbook.getNumberOfSheets();
			logger.info("sheet数量" + numOfSheet);
			// 遍历表
			for (int i = 0; i < numOfSheet; i++) {
				// 获取一个sheet也就是一个工作本。
				Sheet sheet = workbook.getSheetAt(i);
				if (sheet == null)
					continue;
				// 获取一个sheet有多少Row
				int lastRowNum = sheet.getLastRowNum();
				// logger.info("Row(行)数量" + lastRowNum);
				for (int j = 1; j <= lastRowNum; j++) {
					Material material = new Material();
					Row row = sheet.getRow(j);
					if (row == null) {
						continue;
					}
					// 获取一个Row有多少Cell
					short lastCellNum = row.getLastCellNum();
					// logger.info("Cell(列)数量" + lastCellNum);
					for (int k = 0; k <= lastCellNum; k++) {
						Cell cell = row.getCell(k);
						if (cell == null) {
							continue;
						}
						cell.setCellType(CellType.STRING);
						String res = cell.getStringCellValue();
						switch (k) {
						case 0:
							material.setMatCode(res);
							break;
						case 1:
							material.setReqCode(res);
							break;
						case 2:
							material.setUnit(res);
							break;
						case 3:
							material.setMonth(res);
							break;
						case 4:
							material.setOutput(res);
							break;
						case 5:
							Double unit = Double.valueOf(material.getUnit());
							Double output = Double.valueOf(material.getOutput());
							String consume = BigDecimal.valueOf(unit * output).setScale(2, RoundingMode.HALF_UP)
									.toString();
							material.setConsume(consume);
							break;

						default:
							logger.info("怎么来这？为什么");
							break;
						}

					}
					list.add(material);

				}
			}
			// logger.info("获取到的最终结果:" + list);
		}
		return list;
	}

	public static void main(String[] args) throws Exception {

		InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("1569228650981.xls");

		List<Material> list = readExcelFile(inStream, "test.xlsx");

		OutputStream outStream = new FileOutputStream(
				"C:\\Project\\WorkSpace3\\gradle\\service\\src\\main\\resources\\111.xlsx");
		WriteExcel.writeExcel(outStream, list);
	}

}
