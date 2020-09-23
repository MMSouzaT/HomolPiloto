package paginas;

import org.openqa.selenium.WebDriver;

public class FAQCategories extends PageBase{
    public FAQCategories(WebDriver navegador) {
        super(navegador);
    }

    public FAQCategories newCategory() throws InterruptedException {
        openLateralMenu("//a[@ng-click='categoria()']");
        clickButton("//button[@data-target='.modal-categories']");
        return this;
    }

    public FAQCategories editCategory() throws InterruptedException {
        openTypeFilter("//a[@ng-click='categoria()']","//input[@id='filterTitle']","//button[@ng-click='filterCategories(1)']");
        takeLineAndClick("//a[@ng-click='editCategory(item)']");
        return this;
    }

    public FAQCategories deleteCategory() throws InterruptedException {
        openTypeFilter("//a[@ng-click='categoria()']","//input[@id='filterTitle']","//button[@ng-click='filterCategories(1)']");
        takeLineAndClick("//a[@ng-click='deleteCategory(item.id)']");
        clickButton("//button[@style='float: left;']");
        return this;
    }

    public FAQCategories writeEverything(){
        type("//input[@id='title']", swd);
        save("//a[@ng-click='createUpdateCategory()']");
        return this;
    }
}