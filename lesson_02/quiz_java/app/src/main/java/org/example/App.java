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
            AnswerChoice.C,"git branch",
            AnswerChoice.D,"git pull"
        ), AnswerChoice.B
    );
}


private static makeQuizQuestions4(){
    return MultipleChoiceQuizQuestion (
        4,
        "Which IDE is being used in the class?",
        Map.of(
            AnswerChoice.A,"Eclipse",
            AnswerChoice.B,"IntelliJ IDEA",
            AnswerChoice.C,"NetBeans",
            AnswerChoice.D,"VS Code"
        ), AnswerChoice.D
    );
}


private static makeQuizQuestions5(){
    return MultipleChoiceQuizQuestion (
        5,
       "What feature allows developers to work from the same pre-configured environment in VS Code?",
        Map.of(
            AnswerChoice.A,"Extensions",
            AnswerChoice.B,"Debugger",
            AnswerChoice.C,"Dev Containers",
            AnswerChoice.D,"Source Control"
        ), AnswerChoice.C
    );
}


private static makeQuizQuestions6(){
    return MultipleChoiceQuizQuestion (
        6,
        "What is NOT a reason for using an IDE?",
        Map.of(
            AnswerChoice.A,"Editing and refactoring code",
            AnswerChoice.B,"Browsing code",
            AnswerChoice.C,"Playing music",
            AnswerChoice.D,"Managing source control"
        ), AnswerChoice.C
    );
}


private static makeQuizQuestions7(){
    return MultipleChoiceQuizQuestion (
        7,
        "What is the command to list files in the current directory?",
        Map.of(
            AnswerChoice.A,"pwd"
            AnswerChoice.B,"ls",
            AnswerChoice.C,"cd",
            AnswerChoice.D,"mkdir"
        ), AnswerChoice.B
    );
}
