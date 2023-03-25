
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class CompetidorBuilderTest {

    @Test
    void deveRetornarExcecaoParaCompetidorSemNome(){
        try{
            CompetidorBuilder competidorBuilder = new CompetidorBuilder();
            Competidor competidor = competidorBuilder
                    .setAltura(1.93f)
                    .setArteMarcialPrincipal("Gaidojutsu")
                    .setPeso(113F)
                    .build();
            fail();
        }

        catch (IllegalArgumentException e){
            assertEquals("Nome inválido.", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido(){
        CompetidorBuilder competidorBuilder = new CompetidorBuilder();
        Competidor competidor = competidorBuilder
                .setNome("Jonathan Dwight Jones ")
            .setAltura(1.93f)
            .setArteMarcialPrincipal("Gaidojutsu")
            .setPeso(113F)
            .build();

        assertNotNull(competidor);

    }



}
