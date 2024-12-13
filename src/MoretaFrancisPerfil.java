import java.util.Random;
//Crea la clase Perfil
public class MoretaFrancisPerfil {
    private String name;
    private String story;
    private String[] hobbies;
    private String[] foods;
    private String[] funFacts;
//Declaramos el metodo constructor con parametros
    public MoretaFrancisPerfil(String name, String story, String[] hobbies, String[] foods, String[] funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }
//Declaramos Getters y Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStory() {
        return story;
    }
    public void setStory(String story) {
        this.story = story;
    }
    public String[] getHobbies() {
        return hobbies;
    }
    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
    public String[] getFoods() {
        return foods;
    }
    public void setFoods(String[] foods) {
        this.foods = foods;
    }
    public String[] getFunFacts() {
        return funFacts;
    }
    //Getter para obtener un Fun Fact aleatorio
    public String getRandomFunFact() {
        Random r= new Random();
        int e = r.nextInt(funFacts.length);
        return funFacts[e];
    }
    public void setFunFacts(String[] funFacts) {
        this.funFacts = funFacts;
    }

    /**
     * Devuelve una presentacion formateada de la informacion del perfil.
     * @return String con los detalles del perfil.
     */
    public String formatoPerfil() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(name).append("\n");
        sb.append("Story: ").append(story).append("\n");
        sb.append("Hobbies: ").append(String.join(", ", hobbies)).append("\n");
        sb.append("Foods favs: ").append(String.join(", ", foods)).append("\n");
        sb.append("Fun Facts: ").append(String.join(", ", funFacts)).append("\n");
        return sb.toString();
    }
}
