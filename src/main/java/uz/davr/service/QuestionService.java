package uz.davr.service;

import org.springframework.stereotype.Service;
import uz.davr.Response;
import uz.davr.entity.CorrectAnswer;
import uz.davr.entity.Questions;
import uz.davr.repository.CorrectAnswerRepository;
import uz.davr.repository.QuestionRepository;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository repository;
    private final CorrectAnswerRepository correctAnswer;


    public QuestionService(QuestionRepository repository, CorrectAnswerRepository correctAnswer) {
        this.repository = repository;
        this.correctAnswer = correctAnswer;
    }

    public Questions save(Questions questions) {
        Questions question =new Questions();
        Response response=new Response();
        CorrectAnswer answer=new CorrectAnswer(questions.getAnswerCorrect());
        CorrectAnswer save = correctAnswer.save(answer);
        answer.setCorrectAnswer(questions.getAnswerA());
        question.setQuestion(questions.getQuestion());
        question.setAnswerA(questions.getAnswerA());
        question.setAnswerB(questions.getAnswerB());
        question.setAnswerC(save.getCorrectAnswer());
        question.setSection(questions.getSection());
          return   repository.save(questions);
    }

    public List<Questions> getAll() {
        return repository.findAll();
    }
}
