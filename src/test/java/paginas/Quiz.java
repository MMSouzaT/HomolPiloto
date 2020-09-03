package paginas;

import org.openqa.selenium.WebDriver;

public class Quiz extends PageBase {
    public Quiz(WebDriver navegador) {
        super(navegador);
    }

    public Quiz activateQuiz() {
        clickButton("//input[@id='activeQuiz']");
        return this;
    }

    public Quiz newQuestion() throws InterruptedException {
        clickButton("//button[@data-target='.modal-perguntas']");
        waitHalfASecond();
        return this;
    }

    public Quiz deleteQuestion() {
        clickButton("//a[@ng-click='deletarPergunta($index, pergunta.id)']");
        clickButton("//button[@class='btn btn-info btn-sim']");
        return this;
    }

    public Quiz firstQuadrant() throws InterruptedException {
        waitHalfASecond();
        type("//input[@ng-model='questionario.title']", swd);
        type("//input[@ng-model='questionario.description']", "Description by SWD");
        return this;
    }

    public Quiz secondQuadrant() {
        selects("//select[@ng-model='questionario.quiz_session_id']", "Durante o atendimento");
        selects("//select[@ng-model='questionario.group_target_id']", "Beneficiário");
        selects("//select[@ng-model='questionario.group_segment_id']", "Médico");
        return this;
    }

    public Quiz thirdQuadrant() {
        type("//input[@ng-model='questionario.exhibition_start']", "01082020");
        type("//input[@ng-model='questionario.exhibition_end']", "31122020");
        type("//input[@ng-model='questionario.custom_init_message']", "Hi");
        type("//input[@ng-model='questionario.custom_end_message']", "Everybody");
        return this;
    }

    public void saveQuestion() {
        clickButton("//a[@ng-click='criarPerguntaResposta()']");

    }

    public Quiz subjetiveQuestion() {
        type("//input[@ng-model='form.title']", swd + " Sub");
        selects("//select[@ng-model='form.type']", "Resposta subjetiva");
        clickButton("//input[@id='firstQuestion']");
        saveQuestion();
        return this;
    }

    public Quiz objetiveQuestion() {
        type("//input[@ng-model='form.title']", swd + " Ob");
        clickButton("//input[@id='firstQuestion']");
        selects("//select[@ng-model='form.type']", "Resposta objetiva");
        clickButton("//a[@ng-click='novaResposta(form.type)']");
        type("//input[@id='answerTitle']", "01 - Answer");
        type("//input[@id='weight']", "1");
        type("//input[@id='order']", "1");
        clickButton("//a[@ng-click='registerAnswer()']");
        saveQuestion();
        return this;
    }

    public Quiz newQuiz() throws InterruptedException {
        openLateralMenu("//a[@ng-click='questionarios()']");
        clickButton("//a[@ng-click='novoQuestionario()']");
        return new Quiz(navegador);
    }

    public Quiz editQuiz() throws InterruptedException {
        openTypeFilter("//a[@ng-click='questionarios()']", "//input[@ng-model='questionario.title']", "//a[@ng-click='filtrarQuestionario()']");
        clickButton("//a[@ng-click='editarQuestionario(item)']");
        return this;
    }

    public Quiz deleteQuiz() throws InterruptedException {
        openTypeFilter("//a[@ng-click='questionarios()']", "//input[@ng-model='questionario.title']", "//a[@ng-click='filtrarQuestionario()']");
        clickButton("//a[@ng-click='deletarQuestionario(item.id, $index)']");
        clickButton("//button[@style='float: left;']");
        return this;
    }

    public Quiz saveQuiz() {
        clickButton("//button[@ng-click='editarQuestionario()']");
        return this;
    }

    public Quiz successMessageQ() {
        toastValidation("Alteração realizada com sucesso");
        return this;
    }

    public Quiz successDeleteMessage() {
        toastValidation("Questionário excluído com sucesso");
        return this;
    }
}