package com.trinhthianh.pages;

import com.trinhthianh.drivers.DriverManager;
import com.trinhthianh.helpers.PropertiesHelper;
import com.trinhthianh.keywords.WebUI;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MyProjectsPage extends CommonPage{
    private String nameProjectVerify;
    private String nameSearchProjectVerify;
    private String colorProjectVerify;
    private String favoriteProjectVerify;
    private String layoutProjectVerify;
    private String archievdProjectVerify;
    private String messageLimit5Project;
    private By menuMyProjectsBrowse = By.xpath("//android.widget.TextView[@text='Browse']");
    private By menuSearch = By.xpath("//android.widget.TextView[@text='Search']");
    private By titleTodayPage = By.xpath("//android.widget.TextView[@text='Today']");
    private By manageProject = By.xpath("//android.widget.TextView[@text='Manage projects']");
    private By buttonPlusAddProject = By.xpath("//android.view.View[@content-desc='Add']");
    private By addNewProject = By.xpath("//android.widget.TextView[@text='Add project']");
    private By inputNameProject = By.xpath("//android.widget.EditText[@resource-id='com.todoist:id/name']");
    private By promptLimitLengthNameProject  = By.xpath("//android.widget.TextView[@content-desc='Characters entered 120 of 120']");
    private By dropdownColor = By.xpath("//android.widget.TextView[@text='Color']");
    private By optionYellowColor = By.xpath("//android.widget.TextView[@text='Yellow']");
    private By optionTealColor = By.xpath("//android.widget.TextView[@text='Teal']");
    private By parentProjectdropdown = By.xpath("//android.widget.TextView[@text='Parent project']");
    private By searchProject = By.xpath("//android.widget.TextView[@text='Search']");
    private By inputSearchProject = By.xpath("//android.widget.EditText");
    private By searchFistResult = By.xpath("//android.widget.TextView[@text='My Projects']/ancestor::android.view.View[1]/following-sibling::*[1]");
    private By searchNameProjectResult = By.xpath("//android.widget.TextView[@text='My Projects']/ancestor::android.view.View[1]/following-sibling::*[1]/*");
    private By radioBoard = By.xpath("//android.widget.TextView[@text='Board']/following-sibling::*");
    private By toggleAddFavorites = By.xpath("//android.widget.Switch[@resource-id='com.todoist:id/favorite']");
    private By buttonArchive = By.xpath("//android.widget.Button[@resource-id='com.todoist:id/archive']");
    private By buttonAcceptArchive = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    private By buttonCancelArchive = By.xpath("//android.widget.Button[@resource-id='android:id/button2']");
    private By messageArchived= By.xpath("//android.widget.TextView[contains(@text, 'This project is archived.')]");
    private By buttonUnArchived = By.xpath("//android.widget.TextView[@text='UNARCHIVE']");
    private By buttonAcceptUnArchived = By.xpath("//android.widget.Button[@text='UNARCHIVE']");
    private By buttonCancelUnArchived = By.xpath("//android.widget.Button[@text='CANCEL']");
    private By panelEditProject = By.xpath("//android.widget.ScrollView[@resource-id='com.todoist:id/create_project']");
    private By panelProject = By.xpath("//android.widget.ScrollView[@resource-id='android:id/empty']");
    private By buttonSubmitAddProject = By.xpath("//android.widget.Button[@resource-id='com.todoist:id/menu_form_submit']");
    private By messageNameRequired = By.xpath("//android.widget.TextView[@text='Name is required.']");
    private By titleAfterCreateProject = By.xpath("//android.widget.TextView[@resource-id='com.todoist:id/empty_title']");
    private By inputSearch= By.xpath("//android.widget.EditText[@text='Find tasks, projects, and more']");
    private By searchResult= By.xpath("//android.widget.TextView[@resource-id='android:id/title']/following-sibling::*");

    private By projectMoreAction = By.xpath("//android.widget.ImageView[@content-desc='Tùy chọn khác']");
    private By buttonEditProject = By.xpath("//android.widget.TextView[@text='Edit']");
    private By buttonAddComments = By.xpath("//android.widget.TextView[@text='Comments']");
    private By addAComment = By.xpath("//android.widget.TextView[@text='Add a comment']");
    private By inputComment = By.xpath("//android.widget.EditText[@resource-id='com.todoist:id/input']");
    private By submitAddAComment = By.xpath("//android.widget.ImageButton[@content-desc='Submit']");
    private By contentOfComment = By.xpath("//android.widget.TextView[@resource-id='com.todoist:id/note_content']");
    private By moreOptionComment = By.xpath("//android.widget.ImageView[@resource-id='com.todoist:id/note_overflow']");
    private By buttonEditAComment = By.xpath("//android.widget.TextView[@text='Edit']");
    private By commentContainer = By.xpath("//android.widget.FrameLayout[@resource-id='com.todoist:id/note_container']");
    private By backToProject = By.xpath("//android.widget.TextView[@resource-id='com.todoist:id/caption']");
    private By inputEditComment = By.xpath("//android.widget.EditText[@resource-id='android:id/message']");
    private By okEditComment = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    private By cancelEditComment = By.xpath("//android.widget.Button[@text='CANCEL']");
    private By buttonDeleteAComment = By.xpath("//android.widget.TextView[@text='Delete']");
    private By acceptDeleteComment = By.xpath("//android.widget.Button[@text='YES']");
    private By messageEmptyComment = By.xpath("//android.widget.TextView[@text=\"Centralize your project's high-level discussions in project comments.\"]");
    private By cancelDeleteComment = By.xpath("//android.widget.Button[@resource-id='android:id/button2']");
    private By ProjectName = By.xpath("//android.view.ViewGroup[@resource-id='com.todoist:id/toolbar']//android.widget.TextView");
    private By buttonSubmitEditProject = By.xpath("//android.widget.Button[@resource-id='com.todoist:id/menu_form_submit']");
    private By buttonDeleteProject = By.xpath("//android.widget.TextView[@text='Delete']");
    private By buttonConfirmDeleteProject = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    private By buttonCancelDeleteProject = By.xpath("//android.widget.Button[@resource-id='android:id/button2']");
    private By usedLimitProject = By.xpath("//android.widget.TextView[@text ='My Projects']/following-sibling::*[1]");
    private By used5Project = By.xpath("//android.widget.HorizontalScrollView/following::android.widget.TextView[contains(@text, 'projects')]");
    private By addProjectLock = By.xpath("//android.view.View[@content-desc='Add']");
    private By panelLimitProject = By.xpath("//android.widget.ImageView[@content-desc='Promotional image']");
    private By messageLimitProject = By.xpath("//android.widget.TextView[@resource-id='com.todoist:id/promo_dialog_message']");
    private By cancelAddLimitProject  = By.xpath("//android.widget.Button[@text='CANCEL']");





    public void addNewProject(String PROJECT_NAME) {
        WebUI.sleep(1);
        WebUI.clickElement(menuMyProjectsBrowse);
        WebUI.sleep(1);
        WebUI.clickElement(manageProject);
        WebUI.sleep(2);
        WebUI.clickElement(buttonPlusAddProject);
        WebUI.clickElement(addNewProject);
        WebUI.clickElement(inputNameProject);
        WebUI.setText(inputNameProject, PROJECT_NAME);
        WebUI.sleep(1);
        WebUI.clickElement(dropdownColor);
        WebUI.sleep(1);
        WebUI.clickElement(optionYellowColor);
        WebUI.sleep(1);
        WebUI.clickElement(buttonSubmitAddProject);
        WebUI.sleep(2);
        WebUI.verifyAssertTrueIsDisplayed(titleAfterCreateProject, "Error. Message title after create project không xuất hiện.");
        WebUI.verifyEquals(WebUI.getElementText(titleAfterCreateProject), "Start small (or dream big)…", "Nội dung của title không đúng.");
        WebUI.sleep(1);
        WebUI.hoverElementWithHightLight(ProjectName);
        WebUI.sleep(1);
        nameProjectVerify = WebUI.getElementText(ProjectName);
        WebUI.verifyEquals(nameProjectVerify,PROJECT_NAME,"Fail.Tên Project name khác với tên Project vừa tạo");

    }

    public void addNewProjectWithoutRequiredProjectName() {
        WebUI.clickElement(menuMyProjectsBrowse);
        WebUI.sleep(1);
        WebUI.clickElement(manageProject);
        WebUI.clickElement(buttonPlusAddProject);
        WebUI.clickElement(addNewProject);
        WebUI.clickElement(buttonSubmitAddProject);
        WebUI.verifyAssertTrueIsDisplayed(messageNameRequired, "Error Message project name required không xuất hiện.");
        WebUI.verifyEquals(WebUI.getElementText(messageNameRequired), "Name is required.", "Nội dung của message không đúng.");
    }

    public void addNewProjectWithNameExceedsLength(String PROJECT_NAME) {
        WebUI.clickElement(menuMyProjectsBrowse);
        WebUI.sleep(1);
        WebUI.clickElement(manageProject);
        WebUI.clickElement(buttonPlusAddProject);
        WebUI.clickElement(addNewProject);
        WebUI.clickElement(inputNameProject);
        WebUI.setText(inputNameProject, PROJECT_NAME);
        WebUI.verifyEquals(WebUI.getElementText(promptLimitLengthNameProject), "120/120", "Cho phép nhập quá 120 ký tự tên project");

    }



//    public void addMoreThanFiveProject(String PROJECT_NAME) {
//        WebUI.clickElement(menuMyProjectsBrowse);
//        WebUI.sleep(1);
//      //  WebUI.clickElement(manageProject);
//        String usedProjectText = WebUI.getElementText(usedLimitProject);
//        if (usedProjectText.equals("USED: 5/5")){
//            WebUI.clickElement(addProjectLock);
//            WebUI.clickElement(addProject);
//            WebUI.verifyElementVisible(panelLimitProject, "Fail. Vượt quá limit 5 projects nhưng không hiện dialog.");
//            WebUI.clickElement(cancelAddLimitProject);
//            WebUI.sleep(1);
//
//
//        } else {
//            while (!usedProjectText.equals("USED: 5/5")){
//                WebUI.clickElement(addProjectLock);
//                WebUI.clickElement(addProject);
//                WebUI.clickElement(buttonSubmitAddProject);
//                WebUI.verifyAssertTrueIsDisplayed(messageNameRequired, "Error Message project name required không xuất hiện.");
//                WebUI.verifyEquals(WebUI.getElementText(messageNameRequired), "Name is required.", "Nội dung của message không đúng.");
//                WebUI.clickElement(inputNameProject);
//                WebUI.setText(inputNameProject, PROJECT_NAME);
//                WebUI.sleep(1);
//                WebUI.clickElement(dropdownColor);
//                WebUI.sleep(1);
//                WebUI.clickElement(optionYellowColor);
//                WebUI.sleep(1);
//                WebUI.clickElement(toggleAddFavorites);
//                WebUI.sleep(1);
//                WebUI.clickElement(buttonSubmitAddProject);
//                WebUI.sleep(2);
//                WebUI.verifyAssertTrueIsDisplayed(titleAfterCreateProject, "Error. Message title after create project không xuất hiện.");
//                WebUI.verifyEquals(WebUI.getElementText(titleAfterCreateProject), "Start small (or dream big)…", "Nội dung của title không đúng.");
//                WebUI.sleep(1);
//                WebUI.hoverElementWithHightLight(ProjectName);
//                WebUI.sleep(1);
//                nameProjectVerify = WebUI.getElementText(ProjectName);
//                WebUI.verifyEquals(nameProjectVerify,PROJECT_NAME,"Fail.Tên Project name khác với tên Project vừa tạo");
//                WebUI.sleep(2);
//                WebUI.clickElement(menuMyProjectsBrowse);
//                WebUI.sleep(1);
//                usedProjectText = WebUI.getElementText(usedLimitProject);
//            }
//            WebUI.clickElement(addProjectLock);
//            WebUI.clickElement(addProject);
//            WebUI.verifyElementVisible(panelLimitProject, "Fail. Vượt quá limit 5 projects nhưng không hiện dialog.");
//            WebUI.clickElement(cancelAddLimitProject);
//            WebUI.sleep(1);
//
//        }
//
//
//    }

    public void addMoreThanFiveProject(String PROJECT_NAME) {
        WebUI.clickElement(menuMyProjectsBrowse);
        WebUI.sleep(1);
        WebUI.clickElement(manageProject);
        WebUI.clickElement(used5Project);
        String usedProjectText = WebUI.getElementText(used5Project);
        if (usedProjectText.equals("5 projects")){
         //   WebUI.clickElement(addProjectLock);
            WebUI.clickElement(buttonPlusAddProject);
            WebUI.clickElement(addNewProject);
            WebUI.verifyElementVisible(panelLimitProject, "Fail. Vượt quá limit 5 projects nhưng không hiện dialog.");
            messageLimit5Project = WebUI.getElementText(messageLimitProject);
            WebUI.verifyEquals(messageLimit5Project,"You've reached the Free plan's limit of 5 projects.","Fail.Message limit project không đúng");
            WebUI.clickElement(cancelAddLimitProject);
            WebUI.sleep(1);


        } else {
            while (!usedProjectText.equals("5 projects")){
                WebUI.sleep(2);
                WebUI.clickElement(buttonPlusAddProject);
                WebUI.clickElement(addNewProject);
                WebUI.clickElement(inputNameProject);
                WebUI.setText(inputNameProject, PROJECT_NAME);
                WebUI.sleep(1);
                WebUI.clickElement(dropdownColor);
                WebUI.sleep(1);
                WebUI.clickElement(optionYellowColor);
                WebUI.sleep(1);
//        WebUI.clickElement(toggleAddFavorites);
//        WebUI.sleep(1);
                WebUI.clickElement(buttonSubmitAddProject);
                WebUI.sleep(2);
                WebUI.verifyAssertTrueIsDisplayed(titleAfterCreateProject, "Error. Message title after create project không xuất hiện.");
                WebUI.verifyEquals(WebUI.getElementText(titleAfterCreateProject), "Start small (or dream big)…", "Nội dung của title không đúng.");
                WebUI.sleep(1);
                WebUI.hoverElementWithHightLight(ProjectName);
                WebUI.sleep(1);
                nameProjectVerify = WebUI.getElementText(ProjectName);
                WebUI.verifyEquals(nameProjectVerify,PROJECT_NAME,"Fail.Tên Project name khác với tên Project vừa tạo");
                WebUI.sleep(2);
                WebUI.clickElement(menuMyProjectsBrowse);
                WebUI.sleep(1);
                WebUI.clickElement(manageProject);
                usedProjectText = WebUI.getElementText(used5Project);

            }
            WebUI.clickElement(buttonPlusAddProject);
            WebUI.clickElement(addNewProject);
            WebUI.verifyElementVisible(panelLimitProject, "Fail. Vượt quá limit 5 projects nhưng không hiện dialog.");
            WebUI.clickElement(cancelAddLimitProject);
            WebUI.sleep(1);

        }


    }

    public void searchProject(String PROJECT_NAME){
        WebUI.clickElement(menuSearch);
        WebUI.sleep(2);
        WebUI.clickElement(inputSearch);
        WebUI.sleep(1);
        WebUI.setText(inputSearch, PROJECT_NAME);
        WebUI.sleep(2);
        WebUI.keydownEnter(inputSearch);
        WebUI.sleep(2);
      //  WebUI.hoverElement(searchResult);

    }


    public void editNameProject(String UPDATE_PROJECT_NAME) {
        WebUI.clickElement(searchResult);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.clickElement(inputNameProject);
        WebUI.setText(inputNameProject, UPDATE_PROJECT_NAME);
        WebUI.sleep(1);
        WebUI.clickElement(buttonSubmitEditProject);
        WebUI.sleep(1);
        WebUI.hoverElementWithHightLight(ProjectName);
        WebUI.sleep(2);
        nameProjectVerify = WebUI.getElementText(ProjectName);
        WebUI.verifyEquals(nameProjectVerify,UPDATE_PROJECT_NAME,"Fail.Tên Project name khác với tên Project vừa update");

    }

    public void editColorProject() {
        WebUI.clickElement(searchResult);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(dropdownColor);
        WebUI.sleep(1);
        WebUI.clickElement(optionTealColor);
        WebUI.sleep(1);
        WebUI.clickElement(buttonSubmitEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(dropdownColor);
        WebUI.sleep(1);
        colorProjectVerify = WebUI.getElementText(optionTealColor);
        WebUI.verifyEquals(colorProjectVerify,"Teal","Fail.Chưa edit color thành công");
        WebUI.sleep(1);

        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
//        WebUI.clickElement(buttonSubmitEditProject);
//        WebUI.clickElement(projectMoreAction);
//        WebUI.sleep(1);
//        WebUI.clickElement(buttonDeleteProject);
//        WebUI.sleep(1);
//        WebUI.clickElement(buttonConfirmDeleteProject);

    }

    public void editFavoriteProject() {
        WebUI.clickElement(searchResult);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(toggleAddFavorites);
        WebUI.sleep(1);
        WebUI.clickElement(buttonSubmitEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        favoriteProjectVerify = WebUI.getAtribute(toggleAddFavorites);
        WebUI.verifyEquals(favoriteProjectVerify,"true","Fail.Chưa edit favorit project thành công");
        WebUI.sleep(1);


        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
//        WebUI.clickElement(buttonSubmitEditProject);
//        WebUI.clickElement(projectMoreAction);
//        WebUI.sleep(1);
//        WebUI.clickElement(buttonDeleteProject);
//        WebUI.sleep(1);
//        WebUI.clickElement(buttonConfirmDeleteProject);
    }

    public void editParentProject() {
         WebUI.clickElement(searchResult);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(parentProjectdropdown);
        WebUI.sleep(1);
        WebUI.clickElement(searchProject);
        WebUI.sleep(3);
        WebUI.setText(inputSearchProject,"ACBVM_1");
        WebUI.keydownEnter(searchProject);
        nameSearchProjectVerify = WebUI.getElementText(searchNameProjectResult);
        WebUI.verifyEquals(nameSearchProjectVerify,"ACBVM_1","Fail.search project không thành công");
        WebUI.clickElement(searchNameProjectResult);
        WebUI.clickElement(buttonSubmitEditProject);
        WebUI.sleep(1);


        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
//        WebUI.clickElement(projectMoreAction);
//        WebUI.sleep(1);
//        WebUI.clickElement(buttonDeleteProject);
//        WebUI.sleep(1);
//        WebUI.clickElement(buttonConfirmDeleteProject);

    }



    public void editLayoutProject() {
        WebUI.clickElement(searchResult);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(radioBoard);
        WebUI.sleep(2);
        WebUI.clickElement(buttonSubmitEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        layoutProjectVerify = WebUI.getAtribute(radioBoard);
        WebUI.verifyEquals(layoutProjectVerify,"false","Fail.Chưa edit favorit project thành công");
        WebUI.sleep(1);


        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
//        WebUI.clickElement(buttonSubmitEditProject);
//        WebUI.clickElement(projectMoreAction);
//        WebUI.sleep(1);
//        WebUI.clickElement(buttonDeleteProject);
//        WebUI.sleep(1);
//        WebUI.clickElement(buttonConfirmDeleteProject);
    }

    public void editUnArchiveAddToArchiveProject() {
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonArchive);
        WebUI.sleep(1);
        WebUI.clickElement(buttonAcceptArchive);
        WebUI.sleep(1);
        WebUI.clickElement(buttonSubmitEditProject);
        WebUI.sleep(1);
        archievdProjectVerify = WebUI.getElementText(messageArchived);
        WebUI.verifyEquals(archievdProjectVerify,"This project is archived.\n" +
                "Members can view but not edit it.","Fail.Chưa edit archived project thành công");
        WebUI.sleep(1);


        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonConfirmDeleteProject);
    }

    public void editToArchiveProjectNotSuccess() {
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonArchive);
        WebUI.sleep(1);
        WebUI.clickElement(buttonCancelArchive);
        WebUI.sleep(1);
        WebUI.verifyAssertTrueIsDisplayed(panelEditProject,"Fail.Không quay lại màn hình edit project sau khi nhấn cancel Archive");


        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
        WebUI.sleep(1);
        WebUI.clickElement(buttonSubmitEditProject);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonConfirmDeleteProject);
    }


    public void editArchiveToUnArchiveProject() {
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonArchive);
        WebUI.sleep(1);
        WebUI.clickElement(buttonAcceptArchive);
        WebUI.sleep(1);
        WebUI.clickElement(buttonSubmitEditProject);
        WebUI.sleep(1);
        archievdProjectVerify = WebUI.getElementText(messageArchived);
        WebUI.verifyEquals(archievdProjectVerify,"This project is archived.\n" +
                "Members can view but not edit it.","Fail.Chưa edit archived project thành công");
        WebUI.sleep(1);
        WebUI.clickElement(buttonUnArchived);
        WebUI.sleep(1);
        WebUI.clickElement(buttonAcceptUnArchived);
        WebUI.sleep(1);
        WebUI.verifyAssertTrueIsDisplayed(panelProject,"Fail.Chưa unarchive thành công và quay lại project");

        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonConfirmDeleteProject);
    }

    public void editUnArchiveProjectNotSuccessful() {
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonArchive);
        WebUI.sleep(1);
        WebUI.clickElement(buttonAcceptArchive);
        WebUI.sleep(1);
        WebUI.clickElement(buttonSubmitEditProject);
        WebUI.sleep(1);
        archievdProjectVerify = WebUI.getElementText(messageArchived);
        WebUI.verifyEquals(archievdProjectVerify,"This project is archived.\n" +
                "Members can view but not edit it.","Fail.Chưa edit archived project thành công");
        WebUI.sleep(1);
        WebUI.clickElement(buttonUnArchived);
        WebUI.sleep(1);
        WebUI.clickElement(buttonCancelUnArchived);
        WebUI.sleep(1);
        WebUI.verifyAssertTrueIsDisplayed(messageArchived,"Fail.Chưa click cancel Unarchived.");

        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonConfirmDeleteProject);
    }


    public void addcommentInProject(String comment) {
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonAddComments);
        WebUI.sleep(1);
        WebUI.clickElement(addAComment);
        WebUI.sleep(1);
        WebUI.NotClickable(submitAddAComment);
        WebUI.sleep(1);
        WebUI.setText(inputComment,comment);
        WebUI.clickElement(submitAddAComment);
        WebUI.sleep(1);
        WebUI.verifyAssertTrueIsDisplayed(commentContainer,"Fail.Chưa hiện comment vừa thêm");
        WebUI.sleep(1);
        WebUI.verifyAssertTrueEqual(contentOfComment,comment,"Fail. Nội dung comment vừa thêm không khớp");
    }
    public void ediCommentSuccessInProject( String commentUpdate) {
        WebUI.clickElement(moreOptionComment);
        WebUI.sleep(5);
        WebUI.clickElement(buttonEditAComment);
        WebUI.sleep(1);
        WebUI.clickElement(inputEditComment);
        WebUI.sleep(1);
        WebUI.setText(inputEditComment,commentUpdate);
        WebUI.clickElement(okEditComment);
        WebUI.sleep(1);
        WebUI.verifyAssertTrueIsDisplayed(commentContainer,"Fail.Chưa hiện comment vừa thêm");
        WebUI.sleep(1);
        WebUI.verifyAssertTrueEqual(contentOfComment,commentUpdate,"Fail. Nội dung comment vừa thêm không khớp");
        WebUI.sleep(1);

        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
        WebUI.clickElement(backToProject);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonConfirmDeleteProject);


    }

    public void ediCommentNotSuccessInProject(String comment, String commentUpdate) {
        WebUI.clickElement(moreOptionComment);
        WebUI.sleep(1);
        WebUI.clickElement(buttonEditAComment);
        WebUI.sleep(1);
        WebUI.clickElement(inputEditComment);
        WebUI.sleep(1);
        WebUI.setText(inputEditComment,commentUpdate);
        WebUI.clickElement(cancelEditComment);
        WebUI.sleep(1);
        WebUI.verifyAssertTrueIsDisplayed(commentContainer,"Fail.Comment vừa thêm ban đầu biến mất");
        WebUI.sleep(1);
        WebUI.verifyAssertTrueEqual(contentOfComment,comment,"Fail. Nội dung comment khác với lúc trước edit");


//        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
        WebUI.clickElement(backToProject);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonConfirmDeleteProject);

    }

    public void deleteCommentSuccessInProject() {
        WebUI.clickElement(moreOptionComment);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteAComment);
        WebUI.sleep(1);
        WebUI.clickElement(acceptDeleteComment);
        WebUI.sleep(1);
        WebUI.verifyAssertTrueIsDisplayed(messageEmptyComment,"Fail.Chưa xóa comment thành công");


        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
        WebUI.clickElement(backToProject);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonConfirmDeleteProject);

    }

    public void deleteCommentNotSuccessInProject() {
        WebUI.clickElement(moreOptionComment);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteAComment);
        WebUI.sleep(1);
        WebUI.clickElement(cancelDeleteComment);
        WebUI.sleep(1);
        WebUI.verifyAssertTrueIsDisplayed(commentContainer,"Fail.Đã xóa comment.");
        WebUI.sleep(1);



        //xóa project vì nếu vượt quá 5 project sẽ không tạo thêm để test các case khác
        WebUI.clickElement(backToProject);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonConfirmDeleteProject);
    }

    public void deleteProjectSuccess() {
        WebUI.clickElement(searchResult);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonConfirmDeleteProject);
        WebUI.sleep(3);
        WebUI.verifyAssertTrueIsDisplayed(titleTodayPage,"Fail. Chưa trở về trang Today");

    }

    public void deleteProjectNotSuccess() {
        WebUI.clickElement(searchResult);
        WebUI.clickElement(projectMoreAction);
        WebUI.sleep(1);
        WebUI.clickElement(buttonDeleteProject);
        WebUI.sleep(1);
        WebUI.clickElement(buttonCancelDeleteProject);
        WebUI.sleep(3);
        WebUI.verifyAssertTrueIsDisplayed(titleTodayPage,"Fail. Chưa trở về trang Today");
        WebUI.sleep(2);
        WebUI.verifyAssertTrueIsDisplayed(titleAfterCreateProject, "Error. Message title after create project không xuất hiện.");
        WebUI.verifyEquals(WebUI.getElementText(titleAfterCreateProject), "Start small (or dream big)…", "Nội dung của title không đúng.");
        WebUI.sleep(1);

    }

}
