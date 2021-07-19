package uz.davr.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.davr.entity.Questions;
import uz.davr.service.QuestionService;

import java.util.List;

@RestController
public class QuestionController {

    private final QuestionService service;


    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Questions> save(@RequestBody Questions questions){
        Questions save = service.save(questions);
        return ResponseEntity.ok(save);
    }
    @GetMapping
    public ResponseEntity<List<Questions>> getAllQuestions(){
       List<Questions> allQuestions= service.getAll();
       return ResponseEntity.ok(allQuestions);

    }
}
