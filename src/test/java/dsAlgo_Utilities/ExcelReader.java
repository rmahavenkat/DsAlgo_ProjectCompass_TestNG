package dsAlgo_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {

	private static final String path = System.getProperty("user.dir") + "/src/test/resources/Testdata.xlsx";

	public static String[][] getdata(String sheetName, String testtype) throws IOException {

		File excelFile = new File(path);
		try (FileInputStream fis = new FileInputStream(excelFile); XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

			XSSFSheet worksheet = workbook.getSheet(sheetName);
			if (worksheet == null) {
				throw new IllegalArgumentException("Sheet " + sheetName + " not found.");
			}

			int noofRows = worksheet.getPhysicalNumberOfRows();
			int noofcolumns = worksheet.getRow(0).getLastCellNum();

			List<String[]> list = new ArrayList<>();
			DataFormatter df = new DataFormatter();

			for (int i = 1; i < noofRows; i++) {
				String[] rowdata = new String[noofcolumns];
				for (int j = 0; j < noofcolumns; j++) {

					rowdata[j] = df.formatCellValue(worksheet.getRow(i).getCell(j));
				}
				// check type column matches
				if (rowdata[noofcolumns - 1].equalsIgnoreCase(testtype)) {
					if (sheetName.equalsIgnoreCase("Login")) {
						list.add(new String[] { rowdata[0], rowdata[1] });// removing type column validating the data
					} else if (sheetName.equalsIgnoreCase("Register")) {
						list.add(new String[] { rowdata[0], rowdata[1], rowdata[2] });
					} else if (sheetName.equalsIgnoreCase("Pythoncode")) {
						list.add(new String[] { rowdata[0] });
					}

				}
				// System.out.println();
			}
			// workbook.close();
			// fis.close();
			/*
			 * String[][] data = new String[list.size()][]; for (int i = 0; i < list.size();
			 * i++) { data[i] = list.get(i); }
			 */
			return list.toArray(new String[0][0]);
		}

	}

	@DataProvider(name = "validLoginData")
	public static Object[][] validLoginData() throws IOException {
		return getdata("Login", "valid");
	}

	@DataProvider(name = "invalidLoginData")
	public static Object[][] invalidLoginData() throws IOException {
		return getdata("Login", "invalid");
	}

	@DataProvider(name = "usernameEmpty")
	public static Object[][] usernameEmpty() throws IOException {
		return getdata("Login", "username empty");
	}

	@DataProvider(name = "passwordEmpty")
	public static Object[][] passwordEmpty() throws IOException {
		return getdata("Login", "password empty");
	}

	@DataProvider(name = "validregisterData")
	public static Object[][] validregisterData() throws IOException {
		return getdata("Register", "validregister");
	}

	@DataProvider(name = "Emptypassword")
	public static Object[][] enterusername() throws IOException {
		return getdata("Register", "onlyusername");
	}

	@DataProvider(name = "Emptyusername")
	public static Object[][] enterpassword() throws IOException {
		return getdata("Register", "onlypassword");
	}

	@DataProvider(name = "Emptypasswordconfirm")
	public static Object[][] enterpasswordconfirm() throws IOException {
		return getdata("Register", "onlypasswordconfirm");
	}

	@DataProvider(name = "passwordandpwdconfirm")
	public static Object[][] enterpasswordandpwdconfirm() throws IOException {
		return getdata("Register", "onlypassandconfirm");
	}

	@DataProvider(name = "invalidpasswordconfirm")
	public static Object[][] enterinvalidpwdconfirm() throws IOException {
		return getdata("Register", "wrongpasswordconfirm");
	}

	@DataProvider(name = "numericpassword")
	public static Object[][] enternumericpassword() throws IOException {
		return getdata("Register", "invalidpassword");
	}

	@DataProvider(name = "invalidregisterData")
	public static Object[][] invalidregisterData() throws IOException {
		return getdata("Register", "usernamespace");
	}

	@DataProvider(name = "validpythonCode")
	public static Object[][] validpythonCode() throws IOException {
		return getdata("pythonCode", "valid");
	}

	@DataProvider(name = "invalidpythonCode")
	public static Object[][] invalidpythonCode() throws IOException {
		return getdata("pythonCode", "invalid");
	}
}