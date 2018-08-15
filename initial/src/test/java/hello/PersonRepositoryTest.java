package hello;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    PersonRepository repository;

    @Test
    public void testSample(){
        int sum = 3 +4;
        assertThat(sum).isEqualTo(7);
        sum = 4 +4;
        assertThat(sum).isEqualTo(8);
    }

    @Test
    public void testSample2(){
        int sum = 3 +4;
        assertThat(sum).isEqualTo(7);
        sum = 4 +4;
        System.out.println("i am good");
        assertThat(sum).isEqualTo(8);
    }

    @Test
    public void getPerson(){
        Person p = new Person();
        p.setFirstName("testUser");
        p.setLastName("shen");
        repository.save(p);
        List<Person> people = repository.findByLastName("shen");
        assertThat(people.size()).isGreaterThan(0);
    }
}