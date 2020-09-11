package paginas;

import org.openqa.selenium.WebDriver;

public class Categories extends PageBase{
    public Categories(WebDriver navegador) {
        super(navegador);
    }

    public Categories newCategory() throws InterruptedException {
        openLateralMenu("//a[@ng-click='categoria()']");
        clickButton("//button[@data-target='.modal-categories']");
        return this;
    }

    public Categories editCategory() throws InterruptedException {
        openTypeFilter("//a[@ng-click='categoria()']","//input[@id='filterTitle']","//button[@ng-click='filterCategories(1)']");
        takeLineAndClick("//a[@ng-click='editCategory(item)']");
        return this;
    }

    public Categories deleteCategory() throws InterruptedException {
        openTypeFilter("//a[@ng-click='categoria()']","//input[@id='filterTitle']","//button[@ng-click='filterCategories(1)']");
        takeLineAndClick("//a[@ng-click='deleteCategory(item.id)']");
        clickButton("//button[@style='float: left;']");
        return this;
    }

    public Categories writeEverything(){
        type("//input[@id='title']", swd);
        save("//a[@ng-click='createUpdateCategory()']");
        return this;
    }
}