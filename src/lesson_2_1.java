import com.dz.lesson2_1.AgeFamily;
import com.dz.lesson2_1.Cheild;
import com.dz.lesson2_1.Home;
import com.dz.lesson2_1.Parents;

public class lesson_2_1 {
    public static void main(String[] args) {
        String[] commands = {"Сидеть", "Лежать"};
        Shelter romashka = new Shelter(" Ромашка ", "Чуй 1");
        Shelter romashka1 = new Shelter(" Тигр ", "Чуй 2");
        Home home=new Home("Home 1 ","celebrate 1");
        Home home1=new Home("Home 2 ","celebrate 2");
        Home home2=new Home("Home 3 ","celebrate 3");

        Dog dog = new Dog("Чарли", "Алабай", commands, ColorEnum.WHITE, romashka);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гув Гув");
        Dog dog1 = new Dog("Багира", "Питбул",ColorEnum.BLACK, romashka1);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("ГРРР ГРРР");

        Parents objectA=new Parents(4,"Артур ",home, AgeFamily.TWENTY);
        Cheild objectB=new Cheild(5,"Геркулес",home1,AgeFamily.ELEVEN);
        Cheild objectc=new Cheild(7,"Джордж",home2,AgeFamily.TEN);
        System.out.println(objectA.getInfo1());
        System.out.println(objectB.getInfo1());
        System.out.println(objectc.getInfo1());
    }
}
