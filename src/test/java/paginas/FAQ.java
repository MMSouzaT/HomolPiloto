package paginas;

import org.openqa.selenium.WebDriver;

public class FAQ extends PageBase{
    public FAQ(WebDriver navegador) {
        super(navegador);
    }

    public FAQ newFAQ() throws InterruptedException {
        openLateralMenu("//a[@ng-click='faq()']");
        clickButton("//button[@ng-click='createFaq()']");
        return this;
    }

    public FAQ editFAQ(){

        return this;
    }
    public FAQ deleteFAQ(){

        return this;
    }

    public FAQ writeEverything(){
        type("//input[@id='form-title']",swd);
        selects("//select[@id='group_target_id']","Beneficiário");
        selects("//select[@id='formCategory']","Categoria Padrão");
        type("//body[@id='tinymce']",swd);
        save("//button[@ng-click='createUpdateFaq()']");
        return this;
    }
}
