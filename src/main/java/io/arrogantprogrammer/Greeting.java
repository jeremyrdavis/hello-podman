package io.arrogantprogrammer;

public class Greeting {

    String author;

    String greetingText;

    public Greeting(String author, String greetingText) {
        this.author = author;
        this.greetingText = greetingText;
    }

    public Greeting() {
    }

    public String getAuthor() {
        return author;
    }

    public String getGreetingText() {
        return greetingText;
    }
}
