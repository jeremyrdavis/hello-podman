package io.arrogantprogrammer;

public class Greeting {

    String author;

    String greetingText;

    String demo;

    public Greeting(String author, String greetingText, String demo) {
        this.author = author;
        this.greetingText = greetingText;
        this.demo = demo;
    }

    public Greeting() {
    }

    public String getAuthor() {
        return author;
    }

    public String getGreetingText() {
        return greetingText;
    }

    public String getDemo() {
        return demo;
    }
}
