package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.codedifferently.instructional.AnswerChoice;
import com.codedifferently.instructional.MultipleChoiceQuizQuestion;
import com.codedifferently.instructional.QuizPrinter;
import com.codedifferently.instructional.QuizQuestion;

public class App {
   public static void main(String[] args) {
    //this will create a list of quiz questuons 
   List<QuizQuestion> questions = makeQuizQuestions();
   
   //This ensures that is the list is not null
   if(questions != null){
    throw new NullPointerException("The list of questions is null");
   }
   
   QuizPrinter printer = new QuizPrinter();
    printer.print(questions);
    }

    public static makeQuizQuestions():QuizQuestion[] {
        List<QuizQuestion> qeuestions = new ArrayList<>();
        questions.add(makeQuizQuestions0());
        questions.add(makeQuizQuestions1());
        questions.add(makeQuizQuestions2());
        questions.add(makeQuizQuestions3());
        questions.add(makeQuizQuestions4());
        questions.add(makeQuizQuestions5());
        questions.add(makeQuizQuestions6());
        questions.add(makeQuizQuestions7());
        questions.add(makeQuizQuestions8());
        questions.add(makeQuizQuestions9());
        questions.add(makeQuizQuestions10());
        questions.add(makeQuizQuestions11());
        return questions;
    }
}

private static makeQuizQuestions0(){
    return MultipleChoiceQuizQuestion (
        0,
        "What is the main purpose of version control?",
        Map.of(
            AnswerChoice.A,"To make backups of files",
            AnswerChoice.B,"To keep a record of changes over time",
            AnswerChoice.C,"To delete unnecessary files",
            AnswerChoice.D,"To run code more efficiently"
        ), AnswerChoice.B
    );
}

private static makeQuizQuestions1(){
    return MultipleChoiceQuizQuestion (
        1,
        "What is a fork in Git?",
        Map.of(
            AnswerChoice.A,"A duplicate copy of a repository that you own and modify",
            AnswerChoice.B,"A temporary backup of the code",
            AnswerChoice.C,"A tool for merging branches",
            AnswerChoice.D,"A way to delete a repository"
        ), AnswerChoice.A
    );
}

private static makeQuizQuestions2(){
    return MultipleChoiceQuizQuestion (
        2,
        "Which of the following is NOT part of the basic Git workflow?",
        Map.of(
            AnswerChoice.A,"Pull the latest changes",
            AnswerChoice.B,"Commit changes locally",
            AnswerChoice.C,"Push changes to the server",
            AnswerChoice.D,"Write code directly in GitHub"
        ), AnswerChoice.D
    );
}


private static makeQuizQuestions3(){
    return MultipleChoiceQuizQuestion (
        3,
        "What command is used to combine changes from different branches?",
        Map.of(
            AnswerChoice.A,"git commit",
            AnswerChoice.B, "git merge",
            AnswerChoice.C,"Push changes to the server",
            AnswerChoice.D,"Write code directly in GitHub"
        ), AnswerChoice.D
    );
}


