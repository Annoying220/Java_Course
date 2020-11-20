public class Task {
    private String name="Artem";
    private String surname="Yakovlenko";
    private int age=28;
    private String description="X_X";


    public static void main(String[] args) {
        Task task = new Task();

        System.out.println(task.toString());
    }



    @Override
    public String toString() {
        return "My name is " + name + " " + surname + " I am " + age + " years old "
                + "I learn Java because " + description;

    }
}