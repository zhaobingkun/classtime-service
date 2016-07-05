package com.classtime.service.utils;

/**
 * Created by zhaobk on 2015-07-02.
 * 文件读取工具
 */

import java.io.*;
import java.util.Date;
import java.util.TreeSet;


public class FileUtil {

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     *
     * @param fileName 文件名
     */
    public TreeSet<String> readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        TreeSet<String> nums = new TreeSet<String>();
        try {

            reader = new BufferedReader(new FileReader(file));
            String tempString;
            int line = 1;
            //一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                line++;
                nums.add(tempString);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return nums;
    }

    /**
     * 写文件，将文字以splitStr间隔写到文件中
     *
     * @param fileName 写入的文件名字
     * @param content  写入的字符串
     * @param splitStr 写入的字符串间隔符
     */
    public static void writeFileBySplit(String fileName, String content, String splitStr) {
        try {
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(fileName, true);
            String fileArrStr[] = content.split(splitStr);
            for (String str : fileArrStr) {
                writer.write(str);
                writer.write("\r\n");//换行
            }
            //刷新缓冲区
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String oldPath, String newPath) {
        try {
            int byteread;
            File oldfile = new File(oldPath);
            if (oldfile.exists()) {                  //文件存在时
                InputStream inStream = new FileInputStream(oldPath);      //读入原文件
                FileOutputStream fs = new FileOutputStream(newPath);
                byte[] buffer = new byte[1444];
                while ((byteread = inStream.read(buffer)) != -1) {
                    fs.write(buffer, 0, byteread);
                }
                inStream.close();
                fs.close();
            }
        } catch (Exception e) {
            System.out.println("复制单个文件操作出错");
            e.printStackTrace();
        }
    }

    public static void main(String str[]) {
        String fileFrom = "C:\\a.txt";
        String dateStr = DateUtils.formatDate(new Date(), "yyyyMMddHHmmss");
        String fileTo = "C:\\a" + dateStr + ".txt";
        File file = new File(fileFrom);
        if (file.exists()) {
            FileUtil.copyFile(fileFrom, fileTo);
            file.delete();
        }
        FileUtil.writeFileBySplit(fileFrom, "我来测试写文件，怎么样呢，试试吧", "，");

    }
}
