package com.team.view;

import java.util.Scanner;

import com.team.service.StudentsInforMange;
import com.team.service.TeachersInforMange;

public class PrimaryMenu {
	
	//定义输入常量
	private static final Scanner SYS_SCANNER = new Scanner(System.in);
	
    public static void functionMenu() {
        while (true) {
            System.out.println("\t\t====================系统功能====================");
            System.out.println("\t\t                1、教师信息管理                 ");
            System.out.println("\t\t                2、学生信息管理                 ");
            System.out.println("\t\t                0、退出管理系统                 ");
            System.out.println("\t\t===============================================");


            System.out.println("请输入您的选择(0~2)：");
            String select = SYS_SCANNER.nextLine();

            switch (select) {
                case "1":
                    TeachersInforMange.teachMenu();
                    break;
                case "2":
                    StudentsInforMange.stuMenu();
                    break;
                case "0":
                    // 退出系统
                    System.out.println("退出成功，期待您下次光临！");
                    System.exit(0);

                default:
                    System.err.println("您的命令输入有误，请重新确认！\n");
            }
        }

    }
}
