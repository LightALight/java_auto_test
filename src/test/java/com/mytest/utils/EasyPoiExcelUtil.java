package com.mytest.utils;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.mytest.config.Contants;
import com.mytest.entities.CaseInfo;

import java.io.File;
import java.util.List;

public class EasyPoiExcelUtil {
    /**
     * 使用EasyPOI读取Excel数据
     * @return 用例list集合
     * 获取Excel里的所有行
     */
    public static List<CaseInfo> readExcel(int num){
        //读取测试用例
        File file=new File(Contants.EXCEL_PATH);
        //读取和导入Excel的参数配置
        ImportParams params=new ImportParams();
        params.setStartSheetIndex(num);
        //读取测试用例整合成每条用例对象集合
        List<CaseInfo> cases = ExcelImportUtil.importExcel(file, CaseInfo.class, params);
        return cases;
    }


    /**
     * 使用EasyPOI读取Excel数据
     * @return 用例list集合
     * 获取Excel里的指定行
     */
    public static List<CaseInfo> readExcelPart(int num,int startNum,int readRows){
        //读取测试用例
        File file=new File(Contants.EXCEL_PATH);
        //读取和导入Excel的参数配置
        ImportParams params=new ImportParams();
        //读取指定页的Sheet
        params.setStartSheetIndex(num);
        //指定从第几行开始读取
        params.setStartRows(startNum);
        //指定读取几行数据
        params.setReadRows(readRows);
        //读取测试用例整合成每条用例对象集合
        List<CaseInfo> cases = ExcelImportUtil.importExcel(file, CaseInfo.class, params);
        return cases;
    }

    /**
     * 使用EasyPOI读取Excel数据
     * @return 用例list集合
     * 从指定行开始读取下面全部用例
     */
    public static List<CaseInfo> readExcelPart(int num,int startNum){
        //读取测试用例
        File file=new File(Contants.EXCEL_PATH);
        //读取和导入Excel的参数配置
        ImportParams params=new ImportParams();
        //读取指定页的Sheet
        params.setStartSheetIndex(num);
        //指定从第几行开始读取
        params.setStartRows(startNum);
        //读取测试用例整合成每条用例对象集合
        List<CaseInfo> cases = ExcelImportUtil.importExcel(file, CaseInfo.class, params);
        return cases;
    }
}
