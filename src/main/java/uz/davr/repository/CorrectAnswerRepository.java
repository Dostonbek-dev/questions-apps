package uz.davr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.davr.entity.CorrectAnswer;

public interface CorrectAnswerRepository extends JpaRepository<CorrectAnswer , Long> {
}
