//classe figlia: Student
//estensione: extends
//classe padre: Person
public class Student extends Person {

    int[] vote = {7, 5, 9};
    
    Student(String name, String surname, int age){
        super(name, surname, age);
    }

    //dichiaro un metodo accessibile solo per l'istanza di Student
    void studying(){
        System.out.println("Sto studiando....");
    }

    //
    //OVERRIDE METHOD
    @Override
    void greed(){
        System.out.println("Buongiorno");
    }
}

