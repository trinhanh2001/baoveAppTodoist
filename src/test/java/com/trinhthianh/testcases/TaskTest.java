package com.trinhthianh.testcases;

import com.trinhthianh.common.BaseTest;
import com.trinhthianh.helpers.ExcelHelper;
import com.trinhthianh.pages.LoginPage;
import org.testng.annotations.Test;

public class TaskTest extends BaseTest {

    ExcelHelper excelLogin;
    ExcelHelper excelAddTask;
//
//    @Test(priority = 1)
//    public void testAddTaskWithAllInfo() {
//        String TASK_NAME ="Task_Meeting";
//        String TASK_DESCRIPTION ="Đây là description tạo để test";
//        String PROJECT_NAME ="Inbox";
//        String TIME ="15 Jul 15:00";
//
//        excelLogin = new ExcelHelper();
//        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
//        getTaskpage().addNewTask(TASK_NAME,TASK_DESCRIPTION, PROJECT_NAME,TIME);
//        getTaskpage().searchTask(TASK_NAME);
//        getTaskpage().verifyTaskDetail(TASK_NAME,TASK_DESCRIPTION, PROJECT_NAME,TIME);
//    }
//
//    @Test(priority = 2)
//    public void testAddTaskSuccessWithOnlyName() {
//        String TASK_NAME = "First task: Add task success with required filed";
//        excelLogin = new ExcelHelper();
//        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
//        getTaskpage().addTaskSuccessWithRequireField(TASK_NAME);
//    }
//
//    @Test(priority = 2)
//    public void testAddTaskNotSuccessWithoutName() {
//        excelLogin = new ExcelHelper();
//        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
//        getTaskpage().addTaskLackRequireField();
//    }
//
//
//    @Test(priority = 2)
//    public void testAddTaskWithDescription() {
//        String TASK_NAME = "Task 2";
//        String TASK_DESCRIPTION = "Add Task With Description";
//        excelLogin = new ExcelHelper();
//        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
//        getTaskpage().addTaskWithDescription(TASK_NAME,TASK_DESCRIPTION);
//    }

//    @Test(priority = 2)
//    public void testAddTaskWithDateTomorrow() {
//        String TASK_NAME = "Task set time tomorrow";
//        excelLogin = new ExcelHelper();
//        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
//        getInboxPage().addTaskWithDateTomorrow(TASK_NAME);
////    }
//
//    @Test(priority = 2)
//    public void testAddTaskWithDateThisweekend() {
//        String TASK_NAME = "Task set time this week";
//        excelLogin = new ExcelHelper();
//        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
//        getTaskpage().addTaskWithDateThisweekend(TASK_NAME);
//    }
//    @Test(priority = 2)
//    public void testAddTaskWithDateNextWeek() {
//        String TASK_NAME = "Task set time next week";
//        excelLogin = new ExcelHelper();
//        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
//        getTaskpage().addTaskWithDateNextWeek(TASK_NAME);
//    }

//    @Test(priority = 2)
//    public void testAddTaskWithNoDate() {
//        String TASK_NAME = "Task set time to No date";
//        excelLogin = new ExcelHelper();
//        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
//        getInboxPage().addTaskWithNoDate(TASK_NAME);
//    }



//
//    @Test(priority = 2)
//    public void testEditTask() {
//        String TASK_NAME ="Task_1";
//        String TASK_DESCRIPTION ="Đây là description ";
//        String PROJECT_NAME ="Inbox";
//        String TIME ="10 Jul 10:00";
//        String UPDATE_PROJECT_NAME ="ACBVM_999";
//        String UPDATE_TASK_NAME ="TASK_SMART_HOME_UPDATE_NAME";
//        String UPDATE_TASK_DESCRIPTION ="TASK_SMART_HOME_DESCRIPTION_UPDATE" ;
//        String UPDATE_TIME ="15 Jul 15:00";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getTaskpage().addNewTask(TASK_NAME,TASK_DESCRIPTION,PROJECT_NAME,TIME);
//        getTaskpage().searchTask(TASK_NAME);
//        getTaskpage().verifyTaskDetail(TASK_NAME,TASK_DESCRIPTION,PROJECT_NAME,TIME);
//        getTaskpage().editTask(UPDATE_TASK_NAME,UPDATE_TASK_DESCRIPTION,UPDATE_PROJECT_NAME,UPDATE_TIME);
//        getTaskpage().searchTask(UPDATE_TASK_NAME);
//        getTaskpage().verifyTaskDetail(UPDATE_TASK_NAME,UPDATE_TASK_DESCRIPTION,UPDATE_PROJECT_NAME,UPDATE_TIME);
//
//    }
//
//
//    @Test(priority = 3)
//    public void testDeleteTask() {
//        String TASK_NAME ="Task_2";
//        String TASK_DESCRIPTION ="Đây là description ";
//        String PROJECT_NAME ="Inbox";
//        String TIME ="20 Jul 20:00";
//        excelLogin = new ExcelHelper();
//        excelAddTask = new ExcelHelper();
//        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
//        excelAddTask.setExcelFile("DataTest/AddTask.xlsx", "AddTask");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
//        getTaskpage().addNewTask(TASK_NAME,TASK_DESCRIPTION,PROJECT_NAME,TIME);
//        getTaskpage().searchTask(TASK_NAME);
//        getTaskpage().deleteTask();
//
//    }

    @Test(priority = 3)
    public void testDeleteTaskNotSuccess() {
        String TASK_NAME ="Task Delete Task Not Success";
        String TASK_DESCRIPTION ="Đây là description ";
        String PROJECT_NAME ="Inbox";
        String TIME ="20 Jul 20:00";
        excelLogin = new ExcelHelper();
        excelAddTask = new ExcelHelper();
        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
        excelAddTask.setExcelFile("DataTest/AddTask.xlsx", "AddTask");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
        getTaskpage().addNewTask(TASK_NAME,TASK_DESCRIPTION,PROJECT_NAME,TIME);
        getTaskpage().searchTask(TASK_NAME);
        getTaskpage().deleteTaskNotSuccess();

    }

    @Test(priority = 4)
    public void testCompleteAndUndoTask() {
        String TASK_NAME ="Task_Testcase";
        String TASK_DESCRIPTION ="Đây là description ";
        String PROJECT_NAME ="Inbox";
        String TIME ="18 Jul 17:00";
        excelLogin = new ExcelHelper();
        excelAddTask = new ExcelHelper();
        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
        excelAddTask.setExcelFile("DataTest/AddTask.xlsx", "AddTask");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
        getTaskpage().addNewTask(TASK_NAME,TASK_DESCRIPTION,PROJECT_NAME,TIME);
        getTaskpage().searchTask(TASK_NAME);
        getTaskpage().checkCompleteTask(TASK_NAME);
    }

    @Test(priority = 4)
    public void testUndoCompleteTask() {
        String TASK_NAME ="Task_UndoComplete";
        String TASK_DESCRIPTION ="Đây là description ";
        String PROJECT_NAME ="Inbox";
        String TIME ="18 Jul 17:00";
        excelLogin = new ExcelHelper();
        excelAddTask = new ExcelHelper();
        excelLogin.setExcelFile("DataTest/Login.xlsx", "Login");
        excelAddTask.setExcelFile("DataTest/AddTask.xlsx", "AddTask");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccessWithCustomerAccount(excelLogin.getCellData("email", 4), excelLogin.getCellData("password", 4));
        getTaskpage().addNewTask(TASK_NAME,TASK_DESCRIPTION,PROJECT_NAME,TIME);
        getTaskpage().searchTask(TASK_NAME);
        getTaskpage().checkCompleteTask(TASK_NAME);
        getTaskpage().checkUndoCompleteTask();
    }
}
