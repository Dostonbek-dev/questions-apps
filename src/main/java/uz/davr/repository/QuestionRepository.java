package uz.davr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.davr.entity.Questions;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Long> {
}
