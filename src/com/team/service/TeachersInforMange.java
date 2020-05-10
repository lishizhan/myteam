package com.team.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.team.bean.Teachers;

/**
 * 
 * @Description: 教师信息管理类
 * @author: 赖荣耿
 * @version:
 * @date:May 5, 20202:25:42 PM
 *
 */
public class TeachersInforMange {
	
	//创建一个集合用于存储教师信息
    private static final List<Teachers> TEACHERS_ARRAY_LIST = new ArrayList<>();
    //全局输入
    private static final Scanner SYS_SCANNER = new Scanner(System.in);
	
	 public static void teachMenu() {
	        System.out.println("\t\t\t\t\t  *欢迎使用教师管理系统*\n");

	        while (true) {
	            System.out.println("\t\t   ***************教师信息管理***************");
	            System.out.println("\t\t                 1.录入教师信息  ");
	            System.out.println("\t\t                 2.打印教师信息    ");
	            System.out.println("\t\t                 3.录入课时数  ");
	            System.out.println("\t\t                 4.打印课时数  ");
	            System.out.println("\t\t                 5.删除教师信息  ");
	            System.out.println("\t\t                 6.修改教师信息  ");
	            System.out.println("\t\t                 0.退出教师系统  ");
	            System.out.println("\t\t   *****************************************");
	            System.out.println("请输入您的选择(0~3)：");
	            String select = SYS_SCANNER.nextLine();
	            switch (select) {
	                case "1":
	                    addTeacherInfo();
	                    break;
	                case "2":
	                    showTeachInfo();
	                    break;
	                case "3":
	                    addTeacClassHour();
	                    break;
	                case "4":
	                    printClassNum();
	                    break;
	                case "5":
	                    deleteTeacherInfo();
	                    break;
	                case "6":
	                    updataTeacherInfo();
	                    break;
	                case "0":
	                    return;
	                default:
	                    System.err.println("您的命令输入有误，请重新确认！");
	            }
	        }
	    }

	private static void updataTeacherInfo() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteTeacherInfo() {
		// TODO Auto-generated method stub
		
	}

	private static void printClassNum() {
		// TODO Auto-generated method stub
		
	}

	private static void addTeacClassHour() {
		// TODO Auto-generated method stub
		
	}

	private static void showTeachInfo() {
		// TODO Auto-generated method stub
		
	}

	private static void addTeacherInfo() {
		// TODO Auto-generated method stub
		
	}

}
