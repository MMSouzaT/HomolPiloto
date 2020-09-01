package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministrativeGroups extends PageBase {
    public AdministrativeGroups(WebDriver navegador) {
        super(navegador);
    }

    public void openTypeFilter() {
        openLateralMenu("//a[@ng-click='grupos()']");
        type("//input[@id='IdGrupoNome']", "01 - SWD");
        clickButton("//a[@ng-click='filter(1)']");
    }

    public AdministrativeGroups editGroup() {
        openTypeFilter();
        clickButton("//a[@title='Editar']");
        return this;
    }

    public AdministrativeGroups groupCreate() {
        openLateralMenu("//a[@ng-click='grupos()']");
        clickButton("//a[@ng-click='CriarGrupo()']");
        return this;
    }

    public AdministrativeGroups deleteGroup() {
        openTypeFilter();
        clickButton("//a[@title='Excluir']");
        clickButton("//a[@ng-click='DeletarGrupo()']");
        return this;
    }

    public AdministrativeGroups saveGroup() {
        clickButton("//a[@ng-click='SalvarGrupo()']");
        return this;
    }

    public AdministrativeGroups writeEverything() {
        type("//input[@ng-model='form.name']", "01 - SWD");
        type("//input[@ng-model='form.description']", "Description created by SWD");
        return this;
    }

    public void successMessage() {
        toastValidation("Grupo criado com sucesso.");
    }

    public void successMessageEdit() {
        toastValidation("Grupo editado com sucesso.");
    }
}
