package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Quiz extends PageBase {
    public Quiz(WebDriver navegador) {
        super(navegador);
    }


    public Quiz typeTitle(String title) {
        navegador.findElement(By.name("title")).sendKeys(title);
        return this;
    }

    public Quiz typeDescription(String describe) {
        navegador.findElement(By.name("description")).sendKeys(describe);
        return this;
    }

    public Quiz selectSession(String type) {
        WebElement campoType = navegador.findElement(By.name("quiz_session_id"));
        new Select(campoType).selectByVisibleText(type);
        return this;
    }

    public Quiz selectRecipient(String reci) {
        WebElement campoType = navegador.findElement(By.name("group_target_id"));
        new Select(campoType).selectByVisibleText(reci);
        return this;
    }

    public Quiz selectSegment(String segm) {
        WebElement campoType = navegador.findElement(By.id("segmentFilter"));
        new Select(campoType).selectByVisibleText(segm);
        return this;
    }

    public Quiz questionType(String qstT) {
        WebElement campoType = navegador.findElement(By.id("questionType"));
        new Select(campoType).selectByVisibleText(qstT);
        return this;
    }

    public Quiz typeInitialDate(String dateI) {
        navegador.findElement(By.id("exhibition_start")).sendKeys(dateI);
        return this;
    }

    public Quiz typeFinalDate(String dateF) {
        navegador.findElement(By.name("exhibition_end")).sendKeys(dateF);
        return this;
    }

    public Quiz typeInitialMessage(String msgI) {
        navegador.findElement(By.id("inicialMessage")).sendKeys(msgI);
        return this;
    }

    public Quiz typeFinalMessage(String msgF) {
        navegador.findElement(By.id("finalMessage")).sendKeys(msgF);
        return this;
    }

    public Quiz questionFill(String qf) {
        navegador.findElement(By.id("questionTitle")).sendKeys(qf);
        return this;
    }

    public Quiz answerTitle(String at) {
        navegador.findElement(By.id("answerTitle")).sendKeys(at);
        return this;
    }

    public Quiz answerWeight(String aw) {
        navegador.findElement(By.id("weight")).sendKeys(aw);
        return this;
    }

    public Quiz answerOrder(String ao) {
        navegador.findElement(By.id("order")).sendKeys(ao);
        return this;
    }

    public Quiz deleteQuestion(){
        findByXPathClick("//a[@ng-click='deletarPergunta($index, pergunta.id)']");
        findByXPathClick("//button[@class='btn btn-info btn-sim']");
        return this;
    }

    public Quiz cleanAllAboutQuiz(){
        typeTitle("");
        typeDescription("");
        selectSession("Selecionar");
        selectRecipient("Selecionar");
        selectSegment("Selecionar");
        typeInitialDate("");
        typeFinalDate("");
        typeInitialMessage("");
        typeFinalMessage("");
        deleteQuestion();
        return this;
    }
    public Quiz firstQuadrant() {
        typeTitle("01 - SWD");
        typeDescription("Description by SWD");
        return this;
    }

    public Quiz secondQuadrant() {
        selectSession("Durante o atendimento");
        selectRecipient("Beneficiário");
        selectSegment("Médico");
        return this;
    }

    public Quiz thirdQuadrant() {
        typeInitialDate("01082020");
        typeFinalDate("31122020");
        typeInitialMessage("Hi");
        typeFinalMessage("Everybody");
        return this;
    }

    public Quiz activateQuiz() {
        findByIdClick("activeQuiz");
        return this;
    }

    public Quiz newQuestion() {
        findByXPathClick("//button[@data-target='.modal-perguntas']");
        return this;
    }
    public Quiz newQuiz() {
        findByLinkTextClick("QUESTIONÁRIO");
        return this;
    }

    public Quiz editQuiz(){
        navegador.findElement(By.xpath("//input[@ng-model='questionario.title']")).sendKeys("01 - SWD");
        findByLinkTextClick("PESQUISAR");
        findByXPathClick("//a[@title='Editar']");
        return this;
    }



    public Quiz subjetiveQuestion() {
        questionFill("01 - SWDSub");
        questionType("Resposta subjetiva");
        findByIdClick("firstQuestion");
        findByLinkTextClick("SALVAR");
        return this;
    }

    public Quiz objetiveQuestion() {
        questionFill("01 - SWDOb");
        questionType("Resposta objetiva");
        findByIdClick("firstQuestion");
        findByLinkTextClick("NOVA RESPOSTA");
        answerTitle("01 - SWDTA");
        answerWeight("1");
        answerOrder("1");
        findByLinkTextClick("ADICIONAR RESPOSTA");
        findByLinkTextClick("SALVAR");
        return this;
    }

    public Quiz saveQuiz() {
        findByXPathClick("//button[@ng-click='editarQuestionario()']");
        return this;
    }
}