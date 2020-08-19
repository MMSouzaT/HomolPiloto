package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministrativeGroups extends PageBase {
    public AdministrativeGroups(WebDriver navegador) {
        super(navegador);
    }

    public AdministrativeGroups typeGroupName(String name){
        navegador.findElement(By.id("nomeGrupo")).sendKeys(name);
        return this;
    }
    public AdministrativeGroups typeGroupDescribe(String description){
        navegador.findElement(By.id("descricaoGrupo")).sendKeys(description);
        return this;
    }

    public AdministrativeGroups cleanAllAboutAG(){
        typeGroupName("");
        typeGroupDescribe("");
        return this;
    }

    public AdministrativeGroups editGroup(){
        navegador.findElement(By.id("IdGrupoNome")).sendKeys("01 - SWD");
        findByLinkTextClick("FILTRAR");
        findByXPathClick("//a[@title='Editar']");
        return this;
    }
    public AdministrativeGroups groupCreate(){
        findByLinkTextClick("CADASTRO");
        return this;
    }

    public AdministrativeGroups saveGroup(){
        findByLinkTextClick("SALVAR");
        return this;
    }

    public AdministrativeGroups fillAdmGroups(){
        typeGroupName("01 SWD");
        typeGroupDescribe("Description created by SWD");
        return this;
    }



}
