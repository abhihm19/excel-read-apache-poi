package com.sillyproject.excelreadapachepoi.service;

import java.io.IOException;
import java.io.InputStream;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sillyproject.excelreadapachepoi.entity.Employee;

@Service
public class ReadService {

	public List<?> readData(MultipartFile file) {
		List<Employee> employees = new ArrayList<>();

        try (InputStream fileInputStream = file.getInputStream();
                Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            // Assuming you want to read the first sheet in the workbook
            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();

            // Skip the header row
            if (rowIterator.hasNext()) {
                rowIterator.next();
            }
            
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                if (cellIterator.hasNext()) {

                	Employee employee = new Employee();
                	
                	employee.setId((int)cellIterator.next().getNumericCellValue());
                	employee.setName(cellIterator.next().getStringCellValue());
                	employee.setEmailId(cellIterator.next().getStringCellValue());
                	employee.setDateOfBirth(cellIterator.next().getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                	employee.setDateOfJoining(cellIterator.next().getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());

                	employees.add(employee);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

}
