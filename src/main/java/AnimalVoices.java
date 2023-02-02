public class AnimalVoices {
    public static void main(String[] args) {
        AnimalActivities voice = new Cow("Muuu");
        voice.voice();
        voice = new Mouse("Pipipi");
        voice.voice();

    }
}
interface AnimalActivities {
    void voice();
}
class Cow implements AnimalActivities {

    String voice;

    Cow(String voice) {
        this.voice = voice;
    }

    public void voice() {
        System.out.println(voice);
    }
}

class Mouse implements AnimalActivities {

    String voice;

    Mouse(String voice) {
        this.voice = voice;
    }

    public void voice() {
        System.out.println(voice);
    }
}