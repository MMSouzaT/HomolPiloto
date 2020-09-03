package paginas;

import org.openqa.selenium.WebDriver;

public class AdministrativeGroups extends PageBase {
    public AdministrativeGroups(WebDriver navegador) {
        super(navegador);
    }

    public AdministrativeGroups editGroup() throws InterruptedException {
        openTypeFilter("//a[@ng-click='grupos()']", "//input[@id='IdGrupoNome']", "//a[@ng-click='filter(1)']");
        clickButton("//a[@title='Editar']");
        return this;
    }

    public AdministrativeGroups deleteGroup() throws InterruptedException {
        openTypeFilter("//a[@ng-click='grupos()']", "//input[@id='IdGrupoNome']", "//a[@ng-click='filter(1)']");

        clickButton("//a[@data-target='.modal-grupo-deletar']");
        clickButton("//a[@ng-click='DeletarGrupo()']");
        return this;
    }
    public AdministrativeGroups groupCreate() throws InterruptedException {
        openLateralMenu("//a[@ng-click='grupos()']");
        clickButton("//a[@ng-click='CriarGrupo()']");
        return this;
    }

    public AdministrativeGroups writeEverything() {
        type("//input[@ng-model='form.name']", swd);
        type("//input[@ng-model='form.description']", "Description created by SWD");
        clickButton("//a[@ng-click='SalvarGrupo()']");
        return this;
    }

    public void successMessage() {
        toastValidation("Grupo criado com sucesso.");
    }

    public void successMessageEdit() {
        toastValidation("Grupo editado com sucesso.");
    }
}
