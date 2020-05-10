package com.team.view;

/**
 * 
 * @Description: 系统框架设计与任务分配
 * @author: 黎仕展
 * @version:
 * @date:May 5, 20202:39:09 PM
 *
 */
public class ManageSystemMain {
	static {
        System.out.println("*********************计算机系信息管理系统*********************");
        System.out.println("         系统开发人:2018级软件工程B1班 黎仕展,赖荣耿,李甘伟,柯锦富             ");
        System.out.println("                    开发时间: 2020年5月1日                ");
        System.out.println("         版本1.0 JDK1.8 版权所有: 2018级软件工程B1班            ");
        System.out.println("************************************************************");
    }
	public static void main(String[] args) {
		//调用主菜单
		PrimaryMenu.functionMenu();
	}
}
