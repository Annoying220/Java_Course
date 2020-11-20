import com.sun.imageio.plugins.jpeg.JPEGImageReaderResources;

public class Task {
    private String name;
    private String surname;
    private int age;
    private String description;


    public static void main(String[] args) {
        Task task = new Task();

        System.out.println(task.toString());
    }

   /* TODO */

    @Override
    public String toString() {
        return "My name is " + name + " " + surname + " I am " + age + " years old"
                + "I learn Java because " + description;

    }
}