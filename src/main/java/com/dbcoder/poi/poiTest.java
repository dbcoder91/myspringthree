package com.dbcoder.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @Description:测试poi
 * @author: bo.dong
 * @Date: 2018-11-23 15:13:46
 */
public class poiTest {
    public static void main(String[] args) {
        //创建HSSFWorkbook对象
        SXSSFWorkbook sxssfWorkbook = new SXSSFWorkbook();
        //创建sheet对象
        Sheet sheet = sxssfWorkbook.createSheet("test");
        sheet.setColumnWidth(0, 100 * 256);
        //创建Row
        Row row = sheet.createRow(0);
        short height = 50 * 20;
        row.setHeight(height);
        //创建Cell
        CellStyle cellStyle = sxssfWorkbook.createCellStyle();
        cellStyle.setWrapText(true);
        Font font = sxssfWorkbook.createFont();
        font.setColor(HSSFColor.RED.index);
        cellStyle.setFont(font);
        Cell cell = row.createCell(0);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("1 上传的打款数据仅作为标记用，不会实际打款给交易对象，请在上传表格前确认是否已打款；\n" +
                "2 打款后请在明细维度里更改已处理的明细的状态，在其他地方修改，上传后并不会更改系统内明细的状态；\n" +
                "3 上传打款结果时，除明细维度的状态外，请勿更改表格其它信息。支持将待支出的状态修改为已支出");

        Row row1 = sheet.createRow(1);
        cell = row1.createCell(0);
        cell.setCellValue("test");

        try {
            File file = new File("E:\\test0.xlsx");
            System.out.println(file.getAbsoluteFile());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            sxssfWorkbook.write(fileOutputStream);
        } catch (Exception e) {

        }

        System.out.println("行包含单元格数：" + row.getPhysicalNumberOfCells());
    }
}
