package com.team.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.team.bean.Students;

/**
 * 
 * @Description: 学生信息管理类
 * @author: 李甘伟
 * @version:
 * @date:May 5, 20202:24:58 PM
 *
 */

public class StudentsInforMange {
	
	//创建一个集合用于存储学生信息
	private static final List<Students> STUDENTS_ARRAY_LIST = new ArrayList<>();
	private static final Scanner SYS_SCANNER = new Scanner(System.in);
	public static void stuMenu() {
        System.out.println("\t\t\t\t\t  *欢迎使用学生管理系统*\n");
        while (true) {
            System.out.println("\t\t   ***************学生信息管理***************");
            System.out.println("\t\t                 1.录入学生信息");
            System.out.println("\t\t                 2.打印学生信息");
            System.out.println("\t\t                 3.录入学生成绩");
            System.out.println("\t\t                 4.打印学生成绩表");
            System.out.println("\t\t                 5.排序学生信息");
            System.out.println("\t\t                 6.查找学生信息");
            System.out.println("\t\t                 7.删除学生信息");
            System.out.println("\t\t                 8.修改学生信息");
            System.out.println("\t\t                 0.退出学生系统");
            System.out.println("\t\t   *****************************************");
            System.out.println("请输入您的选择(0~5)：");
            String select = SYS_SCANNER.nextLine();
            switch (select) {
                case "1":
                    addStudentInfo();
                    break;
                case "2":
                    printStudentInfo();
                    break;
                case "3":
                    addStudentScore();
                    break;
                case "4":
                    printStudentScort();
                    break;
                case "5":
                    //SortStuInfo.sortStudentInfo(STUDENTS_ARRAY_LIST);
                    break;
                case "6":
                    searchStudentInfo();
                    break;
                case "7":
                    deleteStudentInfo();
                    break;
                case "8":
                    updateStudentInfo();
                    break;
                case "0":
                    return;
                default:
                    System.err.println("您的命令输入有误，请重新确认！");
            }
        }
    }
	private static void updateStudentInfo() {
		// TODO Auto-generated method stub
		
	}
	private static void deleteStudentInfo() {
		// TODO Auto-generated method stub
		
	}
	private static void searchStudentInfo() {
		// TODO Auto-generated method stub
		
	}
	private static void printStudentScort() {
		// TODO Auto-generated method stub
		
	}
	private static void addStudentScore() {
		// TODO Auto-generated method stub
		
	}
	private static void printStudentInfo() {
		// TODO Auto-generated method stub
		
	}
	private static void addStudentInfo() {
		// TODO Auto-generated method stub
		
	}
}
