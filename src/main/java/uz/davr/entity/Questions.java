package uz.davr.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "questionapp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @JsonProperty
    private String question;

    @Column(name = "answera")
    @JsonProperty
    private String answerA;

    @Column(name = "answerb")
    @JsonProperty
    private String answerB;

    @Column(name = "answerc")
    @JsonProperty
    private String answerC;;

    @Column(name = "section")
    @JsonProperty
    public int section;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "answerCorrect_id", referencedColumnName = "id")
    private CorrectAnswer answerCorrect;


}
