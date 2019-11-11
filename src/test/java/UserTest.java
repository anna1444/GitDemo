import static org.junit.Assert.*;

public class UserTest {

    @org.junit.Test
    public void getName() {
        User user = new User("Ann");
        String actual =user.getName();
        String expected = "Ann";
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void setName() {
    }

    @org.junit.Test
    public void sayHello() {
    }

    @org.junit.Test
    public void sayBye() {
    }
}