package _000_TutorialQuestions.Tutorial6;

interface Confidential {
}

class Document {
    String name;

    Document(String name) {
        this.name = name;
    }
}

class PublicDocument extends Document {

    PublicDocument(String name) {
        super(name);
    }
}

class PrivateDocument extends Document implements Confidential {

    PrivateDocument(String name) {
        super(name);
    }
}

public class DocumentManagement {
    public static void main(String[] args) {

        Document d1 = new PublicDocument("College Notice");
        Document d2 = new PrivateDocument("Student Records");

        System.out.println("Document: " + d1.name);

        if (d1 instanceof Confidential)
            System.out.println("Confidential");
        else
            System.out.println("Not Confidential");

        System.out.println("\nDocument: " + d2.name);

        if (d2 instanceof Confidential)
            System.out.println("Confidential");
        else
            System.out.println("Not Confidential");
    }
}