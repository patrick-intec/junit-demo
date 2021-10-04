package be.infernalwhale;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorWithOutputTest {
    SomeRepository repository;

    @BeforeEach
    void init() {
        repository = mock(SomeRepository.class);
        when(repository.save(anyString())).thenReturn("A hardcoded string");
    }


    @Test
    void setupTest() {
        when(repository.save(anyString())).thenReturn("The hardcoded fixed value we want");
        when(repository.isSaved(anyString())).thenReturn(true);


        Assertions.assertNotNull(repository);

        String result = repository.save("A ;laskdjfal;ksjdf;laksjf;laskjdf;alsj");
        System.out.println(result);

        System.out.println(repository.isSaved("String"));
        repository.delete("DELETE");
    }

    @Test
    void secondTest() {


    }
}
