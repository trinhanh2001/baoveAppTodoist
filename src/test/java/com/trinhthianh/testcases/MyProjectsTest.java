package com.trinhthianh.testcases;

import com.trinhthianh.common.BaseTest;
import com.trinhthianh.helpers.ExcelHelper;
import com.trinhthianh.pages.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class MyProjectsTest extends BaseTest {

    @Test(priority = 1)
    public void addNewProject() {
        String PROJECT_NAME ="ACBVM_1";
        ExcelHelper excel = new ExcelHelper();
        excel.setExcelFile("DataTest/Login.xlsx", "Login");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
        getMyProjectsPage().addNewProject(PROJECT_NAME);
    }

    @Test(priority = 2)
    public void addNewProjectWithoutRequiredProjectName() {
        ExcelHelper excel = new ExcelHelper();
        excel.setExcelFile("DataTest/Login.xlsx", "Login");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
        getMyProjectsPage().addNewProjectWithoutRequiredProjectName();
    }

    @Test(priority = 3)
    public void addNewProjectExceedLimitProjectNameLength() {
        String PROJECT_NAME ="V4tEiiYPBuHZxRawbV2uwEJUIuZrqNMQ1y6oIrht2Y3ECf6GYsJsp2b2ipcykj58vfmD9c8PimnSx9Ooo1CzT1IdeUjDxTbg2bKYChVHpTADL321fKJdldoan";
        ExcelHelper excel = new ExcelHelper();
        excel.setExcelFile("DataTest/Login.xlsx", "Login");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
        getMyProjectsPage().addNewProjectWithNameExceedsLength(PROJECT_NAME);
    }


//    @Test(priority = 4)
//    public void testEditNameProject() {
//        String PROJECT_NAME ="ACBVM_2";
//        String UPDATE_PROJECT_NAME ="SMART_HOME_2";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().searchProject(PROJECT_NAME);
//        getMyProjectsPage().editNameProject(UPDATE_PROJECT_NAME);
//    }
//
//    @Test(priority = 5)
//    public void testEditColorProject() {
//        String PROJECT_NAME ="SMART_HOME_2";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().searchProject(PROJECT_NAME);
//        getMyProjectsPage().editColorProject();
//    }
//
//    @Test(priority = 6)
//    public void testEditParentProject() {
//        String PROJECT_NAME ="SMART_HOME_2";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().searchProject(PROJECT_NAME);
//        getMyProjectsPage().editParentProject();
//    }

//    @Test(priority = 7)
//    public void testEditFavoriteProject() {
//        String PROJECT_NAME ="SMART_HOME_2";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().searchProject(PROJECT_NAME);
//        getMyProjectsPage().editFavoriteProject();
//    }
//
//    @Test(priority = 8)
//    public void testEditLayoutProject() {
//        String PROJECT_NAME ="SMART_HOME_2";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().searchProject(PROJECT_NAME);
//        getMyProjectsPage().editLayoutProject();
//    }
//
//    @Test(priority = 9)
//    public void testEditUnArchiveAddToArchiveProjectSuccess() {
//        String PROJECT_NAME ="ACBVM_3";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().editUnArchiveAddToArchiveProject();
//    }

//
//    @Test(priority = 10)
//    public void editArchiveToUnArchiveProjectSuccess() {
//        String PROJECT_NAME ="ACBVM_3";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().editArchiveToUnArchiveProject();
//    }
//    @Test(priority = 11)
//    public void testEditToArchiveProjectNotSuccess() {
//        String PROJECT_NAME ="ACBVM_3";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().editToArchiveProjectNotSuccess();
//    }
//
//    @Test(priority = 12)
//    public void editUnArchiveProjectNotSuccessful() {
//        String PROJECT_NAME ="ACBVM_3";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().editUnArchiveProjectNotSuccessful();
//    }

//    @Test(priority = 13)
//    public void addCommentInProject() {
//        String PROJECT_NAME ="ACBVM_6";
//        String comment = "Đây là comment của "+PROJECT_NAME;
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().addcommentInProject(comment);
//    }
//
//    @Test(priority = 14)
//    public void edicommentSuccessInProject() {
//        String PROJECT_NAME ="ACBVM_6";
//        String comment = "Đây là comment của "+PROJECT_NAME;
//        String commentUpdate = "Đây là comment update sau edit của "+PROJECT_NAME;
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().addcommentInProject(comment);
//        getMyProjectsPage().ediCommentSuccessInProject(commentUpdate);
//    }
//
//    @Test(priority = 15)
//    public void edicommentNotSuccessInProject() {
//        String PROJECT_NAME ="ACBVM_6";
//        String comment = "Đây là comment của "+PROJECT_NAME;
//        String commentUpdate = "Đây là comment update sau edit của "+PROJECT_NAME;
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().addcommentInProject(comment);
//        getMyProjectsPage().ediCommentNotSuccessInProject(comment,commentUpdate);
//    }
//
//    @Test(priority = 16)
//    public void deleteCommentSuccessInProject() {
//        String PROJECT_NAME ="ACBVM_6";
//        String comment = "Đây là comment của "+PROJECT_NAME;
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().addcommentInProject(comment);
//        getMyProjectsPage().deleteCommentSuccessInProject();
//    }
//
//    @Test(priority = 17)
//    public void deleteCommentNotSuccessInProject() {
//        String PROJECT_NAME ="ACBVM_6";
//        String comment = "Đây là comment của "+PROJECT_NAME;
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().addcommentInProject(comment);
//        getMyProjectsPage().deleteCommentNotSuccessInProject();
//    }
//
//    @Test(priority = 18)
//    public void testDeleteProjectSuccess() {
//        String PROJECT_NAME ="ACBVM_7";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().searchProject(PROJECT_NAME);
//        getMyProjectsPage().deleteProjectSuccess();
//    }
//
//    @Test(priority = 19)
//    public void testDeleteProjectNotSuccess() {
//        String PROJECT_NAME ="ACBVM_7";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addNewProject(PROJECT_NAME);
//        getMyProjectsPage().searchProject(PROJECT_NAME);
//        getMyProjectsPage().deleteProjectNotSuccess();
//    }
//
//    @Test(priority = 20)
//    public void testAddMoreThanFiveProject() {
//        String PROJECT_NAME ="ACBVM_8";
//        ExcelHelper excel = new ExcelHelper();
//        excel.setExcelFile("DataTest/Login.xlsx", "Login");
//        LoginPage loginPage = new LoginPage();
//        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
//        getMyProjectsPage().addMoreThanFiveProject(PROJECT_NAME);
//    }


    @Test(priority = 1)
    public void addNewProjectHaveudid(String udid) {
        String PROJECT_NAME ="ACBVM_1";
        ExcelHelper excel = new ExcelHelper();
        excel.setExcelFile("DataTest/Login.xlsx", "Login");
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccessWithCustomerAccount(excel.getCellData("email", 4), excel.getCellData("password", 4));
        getMyProjectsPage().addNewProject(PROJECT_NAME);
    }
}
