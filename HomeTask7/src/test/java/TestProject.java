import org.example.Humans.Family;
import org.example.Humans.Man;
import org.example.Humans.Woman;
import org.example.Pets.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestProject {
    Dog sharik = new Dog("Sharik");
    Man man = new Man("Yaroslav" , "Kravech" , 19 );
    Woman woman = new Woman("Olya" , "Kravech" , 19);
    Family family = new Family(woman , man);
    Man man3 = new Man("V" , "Kravech" , 5 );
    Man man4 = new Man("l" , "Kravech" , 5 );
    Man man5 = new Man("la" , "Kravech" , 5 );

    @Test
    public void testToStringFamily() {
      String expectedFamily = "Family{\n" +
              "mother=Woman{name='Olya', surname='Kravech', year=19, iq=0, schedule={}},\n" +
              "father=Man{name='Yaroslav', surname='Kravech', year=19, iq=0, schedule={}},\n" +
              "children=[],\n" +
              "pet=null}";
      assertEquals(expectedFamily, family.toString());
    }
    @Test
    public void testToStringDog() {

        String expected = "Dog{nickname='Sharik', age=0, trickLevel=0, habits=[]}";

        assertEquals(expected, sharik.toString());
    }
    @Test
    public void testToStringMan() {

        String expected = "Man{name='Yaroslav', surname='Kravech', year=19, iq=0, schedule={}}";
        assertEquals(expected, man.toString());
    }
    @Test
    public void testAddChild1() {
        Man man2 = new Man("Vlad" , "Kravech" , 4 );
        Man man3 = new Man("V" , "Kravech" , 5 );
        Man man4 = new Man("l" , "Kravech" , 5 );
        family.addChild(man2);
        assertEquals(1 , family.getChildren().size());
    }
    @Test
    public void testDeleteChildByIndex2() {
        family.deleteChild(1);
        assertEquals(0 , family.getChildren().size());
    }
    @Test
    public void testDeleteChildByObject1() {
        family.addChild(man3);

        assertTrue(family.deleteChild(man3));

    }
    @Test
    public void testDeleteChildByObject2() {
        family.addChild(man4);

        assertTrue(family.deleteChild(man4));


    }

    @Test
    public void testCountFamily() {

        family.addChild(man5);
        family.setPet(sharik);
        assertEquals(4 , family.countFamily());
    }

}

